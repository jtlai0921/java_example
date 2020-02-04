package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//每個執行緒都會模擬客戶買票、工作人員查詢資料庫和售票交易過程。
//模擬的數據為，當前發往台北、台中和高雄 的火車票各5 張；每個售票廳交易5 次（無論交易成功或失敗）後關閉
public class BookingOffice implements Runnable {

    //表示目前可銷售的車票種類
    private static Map<Destation, Ticket> tickets = new HashMap<Destation, Ticket>();
    //當前售票亭的火車票銷售情況
    private Map<Destation, Integer> records;
    //當前可工作的所有售票亭，每個售票亭是一個執行緒
    private static List<BookingOffice> offices = new ArrayList<BookingOffice>();
    private int ticketsSold = 0;
    private final int id;

    //今天能賣的票:
    static {
        tickets.put(Destation.台北, new Ticket(5, Destation.台北));
        tickets.put(Destation.台中, new Ticket(5, Destation.台中));
        tickets.put(Destation.高雄, new Ticket(5, Destation.高雄));
    }

    public BookingOffice(int id) {
        this.id = id;
        offices.add(this);
        resetRecords();
    }

    private void resetRecords() {
        records = new HashMap<Destation, Integer>(); //new 一筆空記錄 可寫入記錄 
    }

    private void addRecords(Destation d) {
        Integer freq = records.get(d);
        records.put(d, freq == null ? 1 : freq + 1);
    }

    public void run() {

        int transaction = 5;
        while (transaction-- > 0) {
            // 模擬一個顧客進來買票:
            Destation d = Destation.values()[new Random().nextInt(Destation.values().length)];
            print(this + "我要一張票到 " + d);
            // simulate the officer's checking:
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 模擬交易過程:
            Ticket wanted = tickets.get(d);
            synchronized (wanted) {
                if (!wanted.soldout()) {
                    print(this + "賣一張票到 " + d);
                    wanted.degress();
                    addRecords(d);
                    ++ticketsSold;
                    print(this + "" + d + "的票還有 " + wanted.getCurrent() + " 張");
                } else {
                    print(this + "的票到 " + d + " 已經賣完.");
                }
            }
        }
        print(this + "關閉");
        print(this + "今天賣的票: " + ticketsSold + " 張 " + " , 賣的記錄 : " + records);
    }

    public synchronized int getValue() {
        return ticketsSold;
    }

    public String toString() {
        return " < 售票亭 - " + id + " > ";
    }

    static void print(String s) {
        System.out.println(s);
    }
}

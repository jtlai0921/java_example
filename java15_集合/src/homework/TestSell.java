package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSell {

    public static void main(String[] args) throws Exception {

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new BookingOffice(i));
        }
        exec.shutdown();

//        BookingOffice[] bookingOffice = new BookingOffice[5];
//        Thread[] thread = new Thread[5];
//        for (int i = 0; i < bookingOffice.length; i++) {
//            bookingOffice[i] = new BookingOffice(i);
//            thread[i]=new Thread(bookingOffice[i]);
//            thread[i].start();
//
//        }

    }
}

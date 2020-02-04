package source;

public class OverDemo2 {

    public void sayGoodbye() {
        System.out.println("Good-bye！");
    }

    public void sayGoodbye(int times) {
        for (int x = 1; x <= times; x++) {
            System.out.println(x + " Good-bye！");
        }
    }
 
    public String sayGoodbye(String msg, int times) {
        for (int x = 1; x <= times; x++) {
            System.out.println(x + " " + msg);
        }
        return msg;
    }
}

package homework;

public class TestAccount {

    public static void main(String[] args) {
        
        String id = "111-22-3333";
        int money = 10000;

        Account3 MyAccount = new Account3();
        MyAccount.設定資料(id, money);

        if (!MyAccount.密碼驗證()) {
            System.out.println(" 非法使用,請離開 !!! ");
            return;
        }
        MyAccount.銀行作業();
    }
}

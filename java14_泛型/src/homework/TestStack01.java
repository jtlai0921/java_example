package homework;

import javax.swing.JOptionPane;

public class TestStack01 {

    public static void main(String[] args) {
        int num;
        String ans = "";     
        String x;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "輸入堆疊容量："));
        Stack01<String> intStack = new Stack01<String>(num);

        intStack.showstack();
        ans = JOptionPane.showInputDialog(null, "輸入選擇：\n 1.push \n 2.pop \n 3.exit \n");

        while (!ans.equals("3")) {
            System.out.println("##############################################");

            if (ans.equals("1")) {               
                x = JOptionPane.showInputDialog(null, "輸入項目 :");
                if (intStack.push(x)) {
                    System.out.println("push : " + intStack.value);
                } else {
                    System.out.println("推疊已滿");
                }
            }
            if (ans.equals("2")) {
                if (intStack.pop()) {
                    System.out.println("pop : " + intStack.value);
                } else {
                    System.out.println("推疊已空");
                }
            }

            System.out.println("堆疊最新狀態 :");
            intStack.showstack();
            ans = JOptionPane.showInputDialog(null, "輸入選擇：\n 1.push \n 2.pop \n 3.exit \n");
        }
    }
}

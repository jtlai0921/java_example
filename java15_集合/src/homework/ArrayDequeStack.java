package homework;

import java.util.ArrayDeque;

//ArrayDeque集合當stack來使用 先進後出
public class ArrayDequeStack {

    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        // 依次將三個元素push入"棧"
        stack.push("循循漸進Linux");
        stack.push("小學語文");
        stack.push("時間簡史");       
        System.out.println(stack);  // 輸出：[時間簡史, 小學語文, 循循漸進Linux]     
        System.out.println(stack.peek()); //時間簡史        
     
    }
}

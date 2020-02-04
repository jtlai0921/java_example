package homework;

//ArrayDeque集合當 queue 來使用 先進先出
import java.util.ArrayDeque;

public class ArrayDequeQueue
{
    public static void main(String[] args)
    {
        ArrayDeque queue = new ArrayDeque();     
        queue.add("光頭強");
        queue.add("熊大");
        queue.add("熊二");       
        System.out.println(queue);  // 輸出：[光頭強, 熊大, 熊二]      
        System.out.println(queue.remove()); //光頭強
   
    }
}
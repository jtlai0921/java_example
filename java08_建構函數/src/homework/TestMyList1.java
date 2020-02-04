package homework;

import java.util.Scanner;

public class TestMyList1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        MyList1 list = new MyList1();
        System.out.println("串列內容: " + list);

        int opt;
        do {

            System.out.print("\n1.新增 2.刪除  3.印出串列內容 4.結束程式 :");
            opt = s.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("新增位置 : ");
                    int in = s.nextInt();
                    System.out.print("值 : ");
                    String item = s.next();
                    list.add(in, item);
                    System.out.println("串列內容:" + list);
                    break;
                case 2:
                    System.out.print("刪除位置 : ");
                    int de = s.nextInt();
                    list.remove(de);
                    System.out.println("串列內容:" + list);
                    break;
                case 3:
                    System.out.println("串列內容:" + list);
                    break;
                case 4:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("選擇 1-4");
            }

        } while (opt != 4);
    }
}
////////////////////////////////////////////////////////////////////////////////

class Node1 {

    public String value;
    public Node1 address;

    public Node1(String e, Node1 newNext) {
        value = e;
        address = newNext;
    }
}

////////////////////////////////////////////////////////////////////////////////
class MyList1 {

    public Node1 first, last;
    public int size = 0;

    public MyList1() {
        super();
    }

    public void addFirst(String item) {

        Node1 newNode = new Node1(item, null);
        newNode.address = first;
        first = newNode;
        size++;

        if (last == null) {
            last = first;
        }
    }

    public void addLast(String item) {

        if (last == null) {
            first = last = new Node1(item, null);
        } else {
            last.address = new Node1(item, null);
            last = last.address;
        }
        size++;
    }

    public void add(int index, String item) {

        if (index == 0) {
            addFirst(item);
        } else if (index >= size) {
            addLast(item);
        } else {
            Node1 current = first;
            for (int i = 1; i < index; i++) {
                current = current.address;
            }
            Node1 temp = current.address;
            current.address = new Node1(item, null);
            (current.address).address = temp;
            size++;
        }
    }

    public void removeFirst() {

        first = first.address;
        size--;
    }

    public void removeLast() {

        Node1 current = first;
        for (int i = 0; i < (size - 1); i++) {
            current = current.address;
        }
        last = current;
        last.address = null;
        size--;

    }

    public void remove(int index) {

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node1 previous = first;

            for (int i = 0; i < index - 1; i++) {
                previous = previous.address;
            }
            Node1 current = previous.address;
            previous.address = current.address;
            size--;
        }

    }

    public String toString() {

        StringBuffer result = new StringBuffer("[");
        Node1 current = first;

        for (int i = 0; i < size; i++) {

            result.append(current.value).append("(" + i + ")");

            current = current.address;
            if (current != null) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

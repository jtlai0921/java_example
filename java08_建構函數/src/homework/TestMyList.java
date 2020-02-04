package homework;

//public class TestMyList {
//
//    public static void main(String[] args) {
//
//        MyList myList = new MyList();
//
//        myList.addFirst("11");
//        myList.addFirst("22");
//        myList.addFirst("33");
//        myList.addLast("aa");
//        myList.addLast("bb");
//        myList.addLast("cc");
//        myList.addLast("dd");
//        myList.add(0, "xx");
//        myList.add(2, "yy");
//        myList.add(10, "99");
//        /////////////////////////
//        myList.removeFirst();
//        myList.removeLast();
//        myList.remove(1);
//        myList.remove(99);
//        myList.remove(4);
//
//        System.out.println(myList);
//    }
//}
//
//////////////////////////////////////////////////////////////////////////////////
//class Node {
//
//    public String value;
//    public Node address;
//
//    public Node(String value, Node address) {
//        this.value = value;
//        this.address = address;
//    }
//}
//
//////////////////////////////////////////////////////////////////////////////////
//class MyList {
//
//    public Node first, last;
//    public int size;
//
//    public void addFirst(String item) {
//
//        Node newNode = new Node(item, null);
//        newNode.address = first;
//        first = newNode;
//        size++;
//
//        if (last == null) {
//            last = first;
//        }
//    }
//
//    public void addLast(String item) {
//
//        if (last == null) {
//            first = last = new Node(item, null);
//        } else {
//            last.address = new Node(item, null);
//            last = last.address;
//        }
//        size++;
//    }
//
//    public void add(int index, String item) {
//
//        if (index == 0) {
//            addFirst(item);
//        } else if (index >= size) {
//            addLast(item);
//        } else {
//            Node current = first;
//            for (int i = 1; i < index; i++) {
//                current = current.address;
//            }
//            Node temp = current.address;
//            current.address = new Node(item, null);
//            (current.address).address = temp;
//            size++;
//        }
//    }
//
//    public void removeFirst() {
//
//        first = first.address;
//        size--;
//    }
//
//    public void removeLast() {
//
//        Node current = first;
//        for (int i = 1; i < (size - 1); i++) {
//            current = current.address;
//        }
//        last = current;
//        last.address = null;
//        size--;
//    }
//
//    public void remove(int index) {
//
//        if (index == 0) {
//            removeFirst();
//        } else if (index >= size - 1) {
//            index = size - 1;
//            removeLast();
//        } else {
//            Node previous = first;
//
//            for (int i = 1; i < index; i++) {
//                previous = previous.address;
//            }
//            Node current = previous.address;
//            previous.address = current.address;
//            size--;
//        }
//    }
//
//    public String toString() {
//
//        StringBuilder str = new StringBuilder();
//        Node current = first;
//        while (current != null) {
//            str.append(current.value).append(" ");
//            current = current.address;
//        }
//        return str.toString();
//    }
//}

///////////////////////////////////////////////////////////////////////////////

public class TestMyList {

    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.addFirst("11");
        myList.addFirst("22");
        myList.addFirst("33");
        myList.addLast("aa");
        myList.addLast("bb");
        myList.addLast("cc");
        myList.addLast("dd");
        myList.add(0, "xx");
        myList.add(2, "yy");
        myList.add(10, "99");
        /////////////////////////
        myList.removeFirst();
        myList.removeLast();
        myList.remove(1);
        myList.remove(99);
        myList.remove(4);

        System.out.println(myList);
    }
}

////////////////////////////////////////////////////////////////////////////////

class Node {

    public String value;
    public Node address;

    public Node(String value, Node address) {
        this.value = value;
        this.address = address;
    }
}

////////////////////////////////////////////////////////////////////////////////

class MyList {
    public Node first, last;
    public int size;

    public void addFirst(String item) {
        Node newNode = new Node(item, null);
        newNode.address = first;
        first = newNode;
        size++;

        if (last == null) {
            last = first;
        }
    }
    public void addLast(String item) {

    }
    public void add(int index, String item) {

    }
    public void removeFirst() {
        first = first.address;
        size--;
    }
    public void removeLast() {

    }
    public void remove(int index) {

    }
    public String toString() {

        StringBuilder str = new StringBuilder();
        Node current = first;
        while (current != null) {
            str.append(current.value).append(" ");
            current = current.address;
        }
        return str.toString();
    }
}

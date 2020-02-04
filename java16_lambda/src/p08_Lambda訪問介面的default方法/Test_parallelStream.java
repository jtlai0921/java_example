package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;

class Person_parallelStream {

    int id;
    String name;
    String sex;
    float height;

    public Person_parallelStream(int id, String name, String sex, float height) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.height = height;
    }
}


public class Test_parallelStream {

    public static void main(String[] args) {
        doFor(gettPersons());
        doStream(gettPersons());
        doParallelStream(gettPersons());
    }

    public static List<Person_parallelStream> gettPersons() {

        List<Person_parallelStream> persons = new ArrayList<Person_parallelStream>();
        for (int i = 0; i < 5; i++) {
            Person_parallelStream p = new Person_parallelStream(i, "name" + i, "sex" + i, i);
            persons.add(p);
        }
        return persons;
    }

    public static void doFor(List<Person_parallelStream> persons) {
        long start = System.currentTimeMillis();

        for (Person_parallelStream p : persons) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(p.name);
        }

        long end = System.currentTimeMillis();
        System.out.println("doFor cost:" + (end - start));
    }

    //循序流
    public static void doStream(List<Person_parallelStream> persons) {
        long start = System.currentTimeMillis();

        persons.stream().forEach(x -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(x.name);
        });

        long end = System.currentTimeMillis();
        System.out.println("doStream cost:" + (end - start));
    }

    //並行流
    public static void doParallelStream(List<Person_parallelStream> persons) {

        long start = System.currentTimeMillis();

        persons.parallelStream().forEach(x -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(x.name);
        });

        long end = System.currentTimeMillis();

        System.out.println("doParallelStream cost:" + (end - start));
    }
}

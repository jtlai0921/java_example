package p08_Lambda訪問介面的default方法;

import java.util.function.Consumer;

class Person {

    public String firstName;
    public String lastName;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
/////////////////////////////////////////////////////////////////////////////
public class Test_Consumer {

    public static void main(String[] args) {
      //匿名類別
        Consumer<Person> a = new Consumer<Person>() {
            @Override
            public void accept(Person t) {
                System.out.println("Hello, " + t.firstName);
            }
        };     
        a.accept(new Person("Lai", "Yu Sang")); //Hello, Lai
        //Lambda
        Consumer<Person> b = t -> System.out.println("Hello, " + t.firstName);
        b.accept(new Person("Lai", "Yu Sang")); //Hello, Lai
    }
}

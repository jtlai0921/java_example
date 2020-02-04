package p04_方法與建構函數引用;

class Person {

    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

@FunctionalInterface
interface PersonFactory {

    Person create(String firstName, String lastName);
}

////////////////////////////////////////////////////////////////////////////////
public class Test04 {

    public static void main(String[] args) {
        //匿名類別
        PersonFactory a = new PersonFactory() {
            public Person create(String firstName, String lastName) {
                return new Person(firstName, lastName);
            }
        };
        Person p2 = a.create("Lai", "Yu-Sang");
        System.out.println(p2); //Lai Yu-Sang
        //Lambda
        PersonFactory b = (firstName, lastName) -> new Person(firstName, lastName);
        Person p3 = b.create("Lai", "Yu-Sang");
        System.out.println(p3); //Lai Yu-Sang
        //方法引用-4.建構函數 
        PersonFactory c = Person::new;
        Person p4 = c.create("Lai", "Yu-Sang");
        System.out.println(p4); //Lai Yu-Sang
    }
}

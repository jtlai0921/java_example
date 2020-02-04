package p08_Lambda訪問介面的default方法;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + "  " + age;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof Employee)) {
            Employee t = (Employee) obj;
            if ((name.equals(t.name)) && (age == t.age)) {
                return true;
            }
        }
        return false;
    }
    public int hashCode() {
        return (name.hashCode()) ^ (new Integer(age).hashCode());
    }
}
////////////////////////////////////////////////////////////////////////////////
public class Test_Comparator {
    //工廠函數
    public static List<Employee> getEmployee() {
        List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
                new Employee("Harry", 35),
                new Employee("Ethan", 65),
                new Employee("Nancy", 15),
                new Employee("Deborah", 29));
        return employeeList;
    }

    public static void main(String args[]) {
        List<Employee> employeeList = getEmployee();     
        //匿名類別
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee t1, Employee t2) {
                return t1.getName().compareTo(t2.getName());
            }
        });
        System.out.println(employeeList);
       // [Deborah  29, Ethan  65, Harry  35, Nancy  15, Tom Jones  45]
        //Lambda
        Collections.sort(employeeList, (t1, t2) -> t1.getName().compareTo(t2.getName()));
        System.out.println(employeeList);
       //[Deborah  29, Ethan  65, Harry  35, Nancy  15, Tom Jones  45]
    }
}

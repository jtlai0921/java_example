package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class UserA {

    private String name;
    private String role;

    public UserA(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "User Name : " + name + ", Role :" + role;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////
public class Test_Predicate1 {

    public static List<UserA> getUserInstance() {
        List<UserA> users = new ArrayList<UserA>();
        users.add(new UserA("John", "admin"));
        users.add(new UserA("Peter", "member"));
        return users;
    }
    public static List<UserA> process(List<UserA> users, Predicate<UserA> containsadmin) {
        List<UserA> result = new ArrayList<UserA>();
        for (UserA user : users) {
            if (containsadmin.test(user)) {
                result.add(user);
            }
        }
        return result;
    }
    public static void main(String args[]) {
        List<UserA> users = getUserInstance();
        //匿名類別
        List<UserA> person1 = process(users, new Predicate<UserA>() {
            @Override
            public boolean test(UserA t) {
                return t.getRole().equals("admin");
            }
        });
        System.out.println(person1);
        ////////////////////////////////////////       
        //Lambda
        List<UserA> person2 = process(users, t -> t.getRole().equals("admin"));
        System.out.println(person2);
    }    
}

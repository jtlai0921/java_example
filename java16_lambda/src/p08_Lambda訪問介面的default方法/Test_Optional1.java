package p08_Lambda訪問介面的default方法;

import static java.util.Arrays.asList;
import java.util.List;

class UserB {

    int id;
    String name;

    UserB(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
////////////////////////////////////////////////////////////////
public class Test_Optional1 {

    private static List<UserB> getUsers() {
        List<UserB> users = asList(new UserB(1, "Tony"),
                new UserB(2, "John"), new UserB(3, "Emma"));
        return users;//有可能 null
    }

    private static UserB findUserName(String name) {
        List<UserB> users = getUsers();
        if (users != null) {//很好，有檢查 null
            for (UserB u : users) {
                if (u.name.equals(name)) {
                    return u;
                }
            }
        }
        return null;//可能找不到而返回 null
    }

    public static void main(String[] args) {
        UserB user = findUserName("Amy");
        if (user != null) {//很好，有檢查 null
            System.out.println(user.name + " id is " + user.id);
        } else {
            System.out.println("User not found.");
        }
    }
}

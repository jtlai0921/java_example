package p08_Lambda訪問介面的default方法;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Optional;

public class Test_Optional2 {
    //轉換成 Optional型態
    private static Optional<List<UserB>> getUsers() {
        List<UserB> users = asList(new UserB(1, "Tony"),
                new UserB(2, "John"), new UserB(3, "Emma"));
        return Optional.ofNullable(users);
    }
    //改用 Optional 檢查空值
    private static Optional<UserB> findUserName(String name) {
        Optional<List<UserB>> users = getUsers();
        Optional<String> names = Optional.ofNullable(name);
        //對要使用的資料檢查，參數也要
        if (users.isPresent() && names.isPresent()) {
            //使用 stream 取代 foreach 迴圈
            //findFirst()回傳的是 Optional
            return users.get().stream()
                    .filter(t -> t.name.equals(name))
                    .findFirst();
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<UserB> user = findUserName("Amy");
        //使用 isPresent() 有點冗長
        if (user.isPresent()) {
            System.out.println(user.get().name + " id is " + user.get().id);
        } else {
            System.out.println("User not found.");
        }
        //改用 ifPresent 只要一行，但是無值時不做任何回應
        user.ifPresent(t -> System.out.println(t.name + " id is " + t.id));
    }
}

package p04_方法與建構函數引用;

class User {

    private String name;
    private Integer age;

    public User() {
        super();
    }

    public User(String name) {
        super();
        this.name = name;
    }

    public User(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}
////////////////////////////////////////////////////////////
interface Function1<T> {
    T get();
}
interface Function2<T1, T2> {

    T2 get(T1 t1);
}
interface Function3<T1, T2, T3> {

    T3 get(T1 t1, T2 t2);
}

///////////////////////////////////////////////////////////////
class Sub5601 implements Function1<User> {

    @Override
    public User get() {
        return new User();
    }
}
class Sub5602 implements Function2<String, User> {

    @Override
    public User get(String name) {
        return new User(name);
    }
}
class Sub5603 implements Function3<String, Integer, User> {

    @Override
    public User get(String name, Integer age) {
        return new User(name, age);
    }
}


//////////////////////////////////////////////////////////////
public class Test56 {

    public static void main(String[] args) {
        //正常實作
        Function1<User> a = new Sub5601();
        User p1 = a.get();
        System.out.println(p1);
        ////
        Function2<String, User> b = new Sub5602();
        User p2 = b.get("Lai Yu Sang");
        System.out.println(p2);
        /////
        Function3<String, Integer, User> c = new Sub5603();
        User p3 = c.get("Lai Yu Sang", 18);
        System.out.println(p3);
        
        //匿名類別
        Function1<User> d = new Function1<User>() {
            @Override
            public User get() {
                return new User();
            }
        };
        User p4 = d.get();
        System.out.println(p4);
        //////
        Function2<String, User> e = new Function2<String, User>() {
            @Override
            public User get(String name) {
                return new User(name);
            }
        };
        User p5 = e.get("Lai Yu Sang");
        System.out.println(p5);
        //////
        Function3<String, Integer, User> f = new Function3<String, Integer, User>() {
            @Override
            public User get(String name, Integer age) {
                return new User(name, age);
            }
        };
        User p6 = f.get("Lai Yu Sang", 18);
        System.out.println(p6);

        //Lambda
        Function1<User> g = () -> new User();
        User p7 = a.get();
        System.out.println(p7);
        ////
        Function2<String, User> h = (name) -> new User(name);
        User p8 = b.get("Lai Yu Sang");
        System.out.println(p8);
        ////
        Function3<String, Integer, User> i = (name, age) -> new User(name, age);
        User p9 = c.get("Lai Yu Sang", 18);
        System.out.println(p9);

        //方法引用-建構函數
        Function1<User> j = User::new;
        User p10 = d.get();
        System.out.println(p10); //User [name=null, age=null]

        Function2<String, User> k = User::new;
        User p11 = e.get("Lai Yu Sang");
        System.out.println(p11); //User [name=Lai Yu Sang, age=null]

        Function3<String, Integer, User> l = User::new;
        User p12 = f.get("Lai Yu Sang", 18);
        System.out.println(p12); //User [name=Lai Yu Sang, age=18]
    }
}

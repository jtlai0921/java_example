package source.auto;

//自定類別要具有自動關閉資源的能力 , 必須實作 AutoCloseable介面
class Resource implements AutoCloseable {

    public void doSome() {
        System.out.println("作一些事");
    }

    @Override
    public void close() throws Exception { //實作close()方法
        System.out.println("資源被關閉");
    }
}

public class Auto11 {

    public static void main(String[] args) {

        try (Resource res = new Resource()) {
            res.doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

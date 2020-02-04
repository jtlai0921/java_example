package source.auto;

class ResourceSome implements AutoCloseable {

    public void doSome() {
        System.out.println("作一些事_1");
    }

    @Override
    public void close() throws Exception {
        System.out.println("資源Some被關閉_1");
    }
}

class ResourceOther implements AutoCloseable {

    public void doOther() {
        System.out.println("作其它事_2");
    }

    @Override
    public void close() throws Exception {
        System.out.println("資源Other被關閉_2");
    }
}

public class Auto12 {

    public static void main(String[] args) {

        try (ResourceSome some = new ResourceSome();
                ResourceOther other = new ResourceOther()) {
            some.doSome();
            other.doOther();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

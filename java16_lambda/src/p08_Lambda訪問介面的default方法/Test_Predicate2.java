package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;

class ProductX {

    private String name;
    private String color;
    private int price;

    public ProductX(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + color + " " + price;
    }
}

class InitData {

    public static List<ProductX> getProduct() {

        List<ProductX> prdList = new ArrayList<>();
        prdList.add(new ProductX("aaa", "紅色", 5000));
        prdList.add(new ProductX("bbb", "黃色", 10000));
        prdList.add(new ProductX("ccc", "黑色", 12000));
        prdList.add(new ProductX("ddd", "白色", 3000));
        prdList.add(new ProductX("eee", "紅色", 5000));
        prdList.add(new ProductX("fff", "藍色", 4000));
        prdList.add(new ProductX("ggg", "紫色", 20000));
        prdList.add(new ProductX("hhh", "粉色", 2500));
        prdList.add(new ProductX("iii", "紅色", 18000));
        prdList.add(new ProductX("jjj", "澄色", 8000));
        return prdList;
    }
}

//////////////////////////////////////////////////////////////////////////////
public class Test_Predicate2 {

    List<ProductX> proList = InitData.getProduct();
    List<ProductX> products;

    public static void main(String[] args) {
        Test_Predicate2 p = new Test_Predicate2();
        p.傳統方法();
        p.優化1_設計模式();
        p.使用匿名内部類別();
        p.使用lambda表達式();
        p.StreamAPI();
    }
//我們發現實際上這些過濾方法的核心就只有if語句中的條件判断，其他均為模版代碼，
//每次變更一下需求，都需要新增一個方法，然後複製貼上，
//假設這個過濾方法有幾百行，那麼這樣的做法難免笨拙了一點。如何進行優化呢？ 
//篩選顏色為红色

    public void 傳統方法() {

        //傳統方法-篩選顏色-紅色
        products = filterProductByColor(proList);
        System.out.println("傳統方法-篩選顏色-紅色");
        for (ProductX pro : products) {
            System.out.println(pro);
        }

        //傳統方法-篩選價錢-<8000
        products = filterProductByPrice(proList);
        System.out.println("傳統方法-篩選價錢-<8000");
        for (ProductX pro : products) {
            System.out.println(pro);
        }
    }

    public List<ProductX> filterProductByColor(List<ProductX> list) {
        List<ProductX> prods = new ArrayList<>();
        for (ProductX product : list) {
            if ("紅色".equals(product.getColor())) {
                prods.add(product);
            }
        }
        return prods;
    }

// 篩選價格小於8千的
    public List<ProductX> filterProductByPrice(List<ProductX> list) {
        List<ProductX> prods = new ArrayList<>();
        for (ProductX product : list) {
            if (product.getPrice() < 8000) {
                prods.add(product);
            }
        }
        return prods;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//優化1：使用設計模式    
//定義一個MyPredicate介面
//如果想要篩選顏色為红色的商品，定義一個顏色過濾類別
//如果想要篩選價格小於8000的商品，那麼新建一個價格過濾類別即可
//定義過濾方法，將過濾介面型別當做參數傳入，這樣這個過濾方法就不用修改，在實際調用的時候將具體的實現類傳入即可。
//這樣實現的畫可能有人會說，每次變更需求都需要新建一個實現類，感覺還是有點繁鎖呀，那麼再來優化一下 
    //定義一個MyPredicate介面
    interface MyPredicate<T> {

        boolean test(T t);
    }

//如果想要篩選顏色為红色的商品，定義一個顏色過濾類別
    class ColorPredicate implements MyPredicate<ProductX> {

        @Override
        public boolean test(ProductX product) {
            return "紅色".equals(product.getColor());
        }
    }
//如果想要篩選價格小於8000的商品，那麼新建一個價格過濾類別

    class PricePredicate implements MyPredicate<ProductX> {

        @Override
        public boolean test(ProductX product) {
            return product.getPrice() < 8000;
        }
    }

    public List<ProductX> filterProductByPredicate(List<ProductX> list, MyPredicate<ProductX> mp) {
        List<ProductX> prods = new ArrayList<>();
        for (ProductX prod : list) {
            if (mp.test(prod)) {
                prods.add(prod);
            }
        }
        return prods;
    }

    public void 優化1_設計模式() {

        //優化1-使用設計模式-篩選顏色-紅色
        products = filterProductByPredicate(proList, new ColorPredicate());
        System.out.println("優化1-使用設計模式-篩選顏色-紅色");
        for (ProductX pro : products) {
            System.out.println(pro);
        }

        //優化1-使用設計模式-篩選價錢-<8000
        products = filterProductByPredicate(proList, new PricePredicate());
        System.out.println("優化1-使用設計模式-篩選價錢-<8000");
        for (ProductX pro : products) {
            System.out.println(pro);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//優化2：使用匿名内部類別 

    public void 使用匿名内部類別() {
        // 優化2：使用匿名内部類別-篩選顏色-紅色
        products = filterProductByPredicate(proList, new MyPredicate<ProductX>() {
            @Override
            public boolean test(ProductX product) {
                return "紅色".equals(product.getColor());
            }
        });
        System.out.println("優化2：使用匿名内部類別-篩選顏色-紅色");
        for (ProductX pro : products) {
            System.out.println(pro);
        }
        //優化2：使用匿名内部類別-篩選價錢-<8000
        products = filterProductByPredicate(proList, new MyPredicate<ProductX>() {
            @Override
            public boolean test(ProductX product) {
                return product.getPrice() < 8000;
            }
        });
        System.out.println("優化2：使用匿名内部類別-篩選價錢-<8000");
        for (ProductX pro : products) {
            System.out.println(pro);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//優化3：使用lambda表達式 

    public void 使用lambda表達式() {
        //優化3：使用lambda表達式-篩選顏色-紅色
        products = filterProductByPredicate(proList, product -> "紅色".equals(product.getColor()));
        System.out.println("優化3：使用lambda表達式-篩選顏色-紅色");
        for (ProductX pro : products) {
            System.out.println(pro);
        }
        //優化3：使用lambda表達式-篩選價錢-<8000
        products = filterProductByPredicate(proList, p -> p.getPrice() < 8000);
        System.out.println("優化3：使用lambda表達式-篩選價錢-<8000");
        for (ProductX pro : products) {
            System.out.println(pro);
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    //在jdk1.8中還有更加簡便的操作 Stream API
    // 使用jdk1.8中的Stream API進行集合的操作

    public void StreamAPI() {
        System.out.println("Stream API：篩選顏色-紅色");
        // 根據顏色過濾
        proList.stream()
                .filter((p) -> "紅色".equals(p.getColor()))
                .forEach(System.out::println);

        System.out.println("Stream API：篩選價錢-<8000");
        // 根據價格過濾
        proList.stream()
                .filter((p) -> p.getPrice() < 8000)
                // .limit(2)
                .forEach(System.out::println);
        System.out.println("Stream API：遍歷輸出商品名稱顏色價錢");
        // 遍歷輸出商品名稱
        proList.stream()
                .map(ProductX::toString)
                .forEach(System.out::println);
    }
}

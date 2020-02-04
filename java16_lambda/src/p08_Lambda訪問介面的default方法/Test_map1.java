package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    
    String name;
    
    public Product(String name) {
        this.name = name;
    }
}

//////////////////////////////////////////////////////////
public class Test_map1 {
    //工廠函數
    public static List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple"));
        productList.add(new Product("Banana"));
        productList.add(new Product("Cheery"));
        productList.add(new Product("Orange"));
        productList.add(new Product("WaterMelone"));
        return productList;
    }

    public static void main(String[] args) {
        List<Product> productList = getProductList();
        //傳統方式
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        for (Product p : productList) {
            String name = p.name;
            sb.append(name);
            if (++i < productList.size()) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
/////////////////////////////////////////////////////
        // Collectors.joining 方法
        // String str = stream.collect(Collectors.joining()).toString(); //公式       
        String result = productList.stream()
                .map(p -> p.name)
                .collect(Collectors.joining(",", "[", "]")).toString();
        System.out.println(result);
        //[Apple,Banana,Cheery,Orange,WaterMelone]
    }
}

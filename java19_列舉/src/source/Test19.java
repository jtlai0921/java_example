package source;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;
import java.util.TreeSet;

public class Test19 {

    //沒有使用列舉
    public static int where(int type) {
        if (type == 1) {
            //something     
        } else if (type == 2) {
            //something  
        } else {
            //3,4,5,... 沒意義的值，錯誤的值。   
            return 1; //??   
        }
        return 0; //什麼意思？ 
    }

////////////////////////////////////////////////////////////////////////////////
    //使用列舉
    public enum WhereType {

        Asc, Desc
    }

    public enum ReturnCode {

        Ok, Error
    }

    public ReturnCode where(WhereType type) {
        if (type == WhereType.Desc) {
            //something    
        } else if (type == WhereType.Asc) {
            //something     
        }        //不用再處理 3,4,5 這些錯誤的值。        
        return ReturnCode.Ok;
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 列舉1() {
        Color1 x;
        x = Color1.Red;
        System.out.println("x=" + x);
        System.out.println("Color1.Red=" + Color1.Red);
    }

    public static void 列舉2() {

        EnumDemo1.Color2 x;
        x = EnumDemo1.Color2.Red;
        System.out.println("x=" + x);
        System.out.println("EnumDemo1.Color2.Red=" + EnumDemo1.Color2.Red);
    }

////////////////////////////////////////////////////////////////////////////////
    public static void 列舉3() {
        Coffee1 drink = new Coffee1();
        drink.size = CoffeeSize1.HUGE;
        System.out.println("drink.size=" + drink.size);
    }

    public static void 列舉4() {
        Coffee2 drink = new Coffee2();
        drink.size = Coffee2.CoffeeSize2.BIG;
        System.out.println("drink.size=" + drink.size);
    }

    public static void 列舉的值可使用在switch中() {
        Color1 x = Color1.Red;

        switch (x) {
            case Blue:
                System.out.println("Blue");
                break;
            case Red:
                System.out.println("Red");
                break;
            case Black:
                System.out.println("Black");
        }
    }

    public static void 列舉與Map() {
        //列舉可以放在 Map 裡當 values
        Map<Integer, Example> m = new HashMap<Integer, Example>();
        m.put(1, Example.ONE);
        m.put(2, Example.TWO);
        m.put(3, Example.THREE);

        System.out.println(m);
    }

    public static void 列舉與TreeSet() {
        //列舉可以放在 TreeSet 並且可排序
        Set<Example> s = new TreeSet<Example>();
        s.add(Example.TWO);
        s.add(Example.THREE);
        s.add(Example.ONE);
        s.add(Example.Four);
        System.out.println(s);
    }

    public static void 呼叫四則運算() {
        int x = 10;
        int y = 5;

        System.out.println(四則運算(x, y, Count.加));
        System.out.println(四則運算(x, y, Count.減));
        System.out.println(四則運算(x, y, Count.乘));
        System.out.println(四則運算(x, y, Count.除));
    }

    public static int 四則運算(int x, int y, Count p) {

        switch (p) {

            case 加:
                return x + y;
            case 減:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            default:
                return 0;
        }
    }
}

package source;



public class GenericDemo1 {

}

class Foo1 {

    private int foo;

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public int getFoo() {
        return foo;
    }
}

class Foo2 {

    private double foo;

    public void setFoo(double foo) {
        this.foo = foo;
    }

    public double getFoo() {
        return foo;
    }
}

//////////////////////////////////////////////////////////////////////////////
class Foo3 {

    private Integer foo;

    public void setFoo(Integer foo) {
        this.foo = foo;
    }

    public Integer getFoo() {
        return foo;
    }
}

class Foo4 {

    private Double foo;

    public void setFoo(Double foo) {
        this.foo = foo;
    }

    public Double getFoo() {
        return foo;
    }
}

class Foo5 {

    private Object foo;

    public void setFoo(Object foo) {
        this.foo = foo;
    }

    public Object getFoo() {
        return foo;
    }
}

////////////////////////////////////////////////////////////////////////////////
class GenericFoo1<T> {

    private T foo;

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public T getFoo() {
        return foo;
    }
}

////////////////////////////////////////////////////////////////////////////////
//class GenericFoo1<Integer> {
//
//    private Integer foo;
//
//    public void setFoo(Integer foo) {
//        this.foo = foo;
//    }
//
//    public Integer getFoo() {
//       return foo;
//    }
//}

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//class GenericFoo1 <Double>{
//
//    private Double foo;
//
//    public void setFoo(Double foo) {
//        this.foo = foo;
//    }
//
//    public Double getx() {
//        return foo;
//    }
//}
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//class GenericFoo1<Boolean> {
//
//    private Boolean foo;
//
//    public void setFoo(Boolean foo) {
//         this.foo = foo;
//    }
//
//    public Boolean getx() {
//        return foo;
//    }
//}
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//class GenericFoo1 {
//
//    private Object foo;
//
//    public void setFoo(Object foo) {
//        this.foo = foo;
//    }
//
//    public Object getx() {
//       return foo;
//    }
//}

///////////////////////////////////////////////////////////////////////////////

class GenericFoo2<T extends Number> {

    private T foo;

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public T getFoo() {
        return foo;
    }
}

class GenericFoo3<T extends String> {

    private T foo;

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public T getFoo() {
        return foo;
    }
}


////////////////////////////////////////////////////////////////////////////// 
//HashSet集合
//public class HashSet<E> extends AbstractSet<E>
//        implements Set<E>, Cloneable, java.io.Serializable {//
//    
//    public HashSet() {
//        map = new HashMap<>();
//    }
//}
//////////////////////////////////////////////////////////////////////////////

//宣告多個類型持有者
class GenericFoo5<T1, T2> {

    private T1 foo1;
    private T2 foo2;

    public void setFoo1(T1 foo1) {
        this.foo1 = foo1;
    }

    public T1 getFoo1() {
        return foo1;
    }

    public void setFoo2(T2 foo2) {
        this.foo2 = foo2;
    }

    public T2 getFoo2() {
        return foo2;
    }
}

//////////////////////////////////////////////////////////////////////////////

//陣列
class GenericFoo6<T> {

    private T[] fooArray;

    public void setFooArray(T[] fooArray) {
        this.fooArray = fooArray;
    }

    public T[] getFooArray() {
        return fooArray;
    }
}

//////////////////////////////////////////////////////////////////////////////

//特定類型物件的容器
class SimpleCollection<T> {

    private T[] objArr;
    private int index = 0;

    public SimpleCollection() {
        objArr = (T[]) new Object[10];
    }

    public SimpleCollection(int capacity) {
        objArr = (T[]) new Object[capacity];
    }

    public void add(T t) {
        objArr[index] = t;
        index++;
    }

    public int getLength() {
        return index;
    }

    public T get(int i) {
        return (T) objArr[i];
    }

    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < index; i++) {
            if (i < index - 1) {
                s.append(objArr[i]).append(",");
            } else {
                s.append(objArr[i]);
            }

        }
        s.append("]");
        return s.toString();
    }
}

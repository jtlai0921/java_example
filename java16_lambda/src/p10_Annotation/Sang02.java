package p10_Annotation;
//標示方法為 Deprecated @Deprecated

class Something {

    @Deprecated
    public Something getSomething() {
        return new Something();
    }
}

public class Sang02 {

    public static void main(String[] args) {
        Something some = new Something();
        // 呼叫被@Deprecated標示的方法
        some.getSomething();
    }

}
//想要知道詳細的警訊內容的話，可以在編譯時加上 -Xlint:deprecation 引數，
//編譯器會告訴您是因為您使用了某個被 @Deprecated 標示了的方法而提出警訊，加上 -Xlint:deprecation 引數顯示的完整訊息如下：
//javac -Xlint:deprecation -d . SomethingDemo.java
//SomethingDemo.java:6: warning: [deprecation] getSomething() in 
//onlyfun.caterpillar.Something has been deprecated
//        some.getSomething();
//        ^
//1 warning
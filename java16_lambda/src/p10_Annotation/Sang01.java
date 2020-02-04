package p10_Annotation;

//J2SE 5.0 中對 metadata 提出的功能是 Annotation，metadata 就是「資料的資料」（Data about data）
//，突然看到這樣的解釋會覺得奇怪，但以表格為例，表格中呈現的就是資料，但有時候還會有額外的資料用來說明表格的作用，
//從這個角度來看，metadata 就不這麼的奇怪。
//在 J2SE 5.0 中，Annotation 的主要目的介於原始碼與 API 文件說明之間，
//Annotation 對程式碼作出一些說明與解釋，Class 中可以包含這些解釋，編譯器或其它程式分析工作可以使用 Annotation 來作分析，
//您可以從 java.lang.Override、java.lang.Deprecated、java.lang.SuppressWarnings 這三個 J2SE 5.0 中標準的 Annotation 型態開始瞭解 Annotation 的作用。
//Annotation 對程式運行沒有影響，它的目的在對編譯器或分析工具說明程式的某些資訊，
//您可以在套件、類別、方法、資料成員等加上 Annotation，
//每一個 Annotation 對應於一個實際的 Annotation 型態，
//您可以從 java.lang.Override、java.lang.Deprecated、java.lang.SuppressWarnings 這三個 J2SE 5.0 中標準的 Annotation 型態開始瞭解 Annotation 的作用
//限定 Override 父類方法 @Override
//////////////////////////////////
//class CustomClass {
//
//    @Override
//    public String ToString() {
//        return "customObject";
//    }
//}
/////////////////////////////////
class CustomClass {

    @Override
    public String toString() {
        return "customObject";
    }
}
public class Sang01 {

    public static void main(String[] args) {

    }

}

package p10_Annotation;

import java.lang.reflect.Method;

/* 
   * 元注解@Target,@Retention,@Documented,@Inherited 
   *  
   *     @Target 表示該注解用於什麼地方，可能的 ElemenetType 參數包括： 
   *         ElemenetType.CONSTRUCTOR 構造器聲明 
   *         ElemenetType.FIELD 域聲明（包括 enum 實例） 
   *         ElemenetType.LOCAL_VARIABLE 區域變數聲明 
   *         ElemenetType.METHOD 方法聲明 
   *         ElemenetType.PACKAGE 包聲明 
   *         ElemenetType.PARAMETER 參數聲明 
   *         ElemenetType.TYPE 類，介面（包括注解類型）或enum聲明 
   *          
   *     @Retention 表示在什麼級別保存該注解資訊。可選的 RetentionPolicy 參數包括： 
  *         RetentionPolicy.SOURCE 注解將被編譯器丟棄 
   *         RetentionPolicy.CLASS 注解在class文件中可用，但會被VM丟棄 
   *         RetentionPolicy.RUNTIME VM將在運行期也保留注釋，因此可以通過反射機制讀取注解的資訊。 
   *          
   *     @Documented 將此注解包含在 javadoc 中 
   *      
   *     @Inherited 允許子類繼承父類中的注解 
   *    
 */


public class Test_1 {

    /* 
          * 被注解的三個方法 
     */
    @Test(id = 1, description = "hello method_1")
    public void method_1() {
    }

    @Test(id = 2)
    public void method_2() {
    }

    @Test(id = 3, description = "last method")
    public void method_3() {
    }

    /* 
      * 解析注解，將Test_1類 所有被注解方法 的資訊列印出來 
     */
    public static void main(String[] args) {
        Method[] methods = Test_1.class.getDeclaredMethods();
        for (Method method : methods) {
            /* 
               * 判斷方法中是否有指定注解類型的注解 
             */
            boolean hasAnnotation = method.isAnnotationPresent(Test.class);
            if (hasAnnotation) {
                /* 
                   * 根據注解類型返回方法的指定類型注解 
                 */
                Test annotation = method.getAnnotation(Test.class);
                System.out.println("Test( method = " + method.getName()
                        + " , id = " + annotation.id() + " , description = "
                        + annotation.description() + " )");
            }
        }
    }

}

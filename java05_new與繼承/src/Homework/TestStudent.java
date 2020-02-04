package Homework;

public class TestStudent {

    public static void main(String[] args) {
        
        Student s1 = new Student("甲", 78, 75, 79);
        Student.寫檔案(s1.toString());
        Student s2 = new Student("乙", 77, 68, 45);
        Student.寫檔案(s2.toString());
        Student s3 = new Student("丙", 69, 99, 45);
        Student.寫檔案(s3.toString());
        Student s4 = new Student("丁", 65, 69, 33);
        Student.寫檔案(s4.toString());
        Student s5 = new Student("戊", 46, 79, 68);
        Student.寫檔案(s5.toString());
        
    }
}
//Student.txt
//甲,78.0,75.0,79.0,232.0,77.33333333333333
//乙,77.0,68.0,45.0,190.0,63.333333333333336
//丙,69.0,99.0,45.0,213.0,71.0
//丁,65.0,69.0,33.0,167.0,55.666666666666664
//戊,46.0,79.0,68.0,193.0,64.33333333333333
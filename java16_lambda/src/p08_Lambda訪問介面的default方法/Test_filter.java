package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    private String name;
    private int score;

    public Student() {
        super();
    }

    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[姓名=" + name + ", 分數=" + score + "]";
    }
}

////////////////////////////////////////////////////////////////////////////////
public class Test_filter {

    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>(10);
        studentList.add(new Student("劉一", 85));
        studentList.add(new Student("陳二", 90));
        studentList.add(new Student("張三", 98));
        studentList.add(new Student("李四", 88));
        studentList.add(new Student("王五", 100));
        return studentList;
    }

    public static void main(String[] args) {
     
        List<Student> result1 = new ArrayList<>(5);    
        for (Student s : getStudentList()) {
            if (s.getScore() >= 90) {
                result1.add(s);
            }
        }      
        //傳統的寫法   
        result1.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {              
                return Integer.compare(s2.getScore(), s1.getScore());
            }
        });
        System.out.println(result1);

///////////////////////////////////////////////////////////////////////////////
        //使用stream的寫法       
        result1 = getStudentList().stream()
                .filter(s -> s.getScore() >= 90)
                //.sorted((s1,s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                //使用Comparator中的comparing方法
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .collect(Collectors.toList());
        System.out.println(result1);
        //[[姓名=王五, 分數=100], [姓名=張三, 分數=98], [姓名=陳二, 分數=90]]
    }
}

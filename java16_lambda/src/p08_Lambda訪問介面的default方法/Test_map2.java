package p08_Lambda訪問介面的default方法;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test_map2 {

    public static List<Student> getStudentList() {
        List<Student> stuList = new ArrayList<>(10);
        stuList.add(new Student("劉一", 85));
        stuList.add(new Student("陳二", 90));
        stuList.add(new Student("張三", 98));
        stuList.add(new Student("李四", 100));
        stuList.add(new Student("王五", 83));  
        return stuList;
    }

    public static void main(String[] args) {
        List<Student> studentlist = getStudentList();
        //使用map方法獲取list數據中的name
        List<String> names = studentlist.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);   //[劉一, 陳二, 張三, 李四, 王五]     
        //使用map方法獲取list數據中的name的長度
        List<Integer> length = studentlist.stream()
                .map(Student::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(length);  //[2, 2, 2, 2, 2]      
        //將每人的分數-10
        List<Integer> score = studentlist.stream()
                .map(Student::getScore)
                .map(i -> i - 10)
                .collect(Collectors.toList());
        System.out.println(score);  //[75, 80, 88, 90, 73]      
        //計算學生總分
        Integer totalScore1 = studentlist.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b); //有給初始值
        System.out.println(totalScore1); //456       
        //計算學生總分，返回Optional類型的數據，主要用來避免nullpointer異常
        Optional<Integer> totalScore2 = studentlist.stream()
                .map(Student::getScore)
                .reduce((a, b) -> a + b); //沒給初始值
        System.out.println(totalScore2.get());  //456
      
        //計算最高分和最低分
        Optional<Integer> max = studentlist.stream()
                .map(Student::getScore)
                .reduce(Integer::max);
        Optional<Integer> min = studentlist.stream()
                .map(Student::getScore)
                .reduce(Integer::min);
        System.out.println(max.get()); //100
        System.out.println(min.get()); //83
    }
}

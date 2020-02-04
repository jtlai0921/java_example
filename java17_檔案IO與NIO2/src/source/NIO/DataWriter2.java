package source.NIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataWriter2 {

    DataOutputStream dataOutput;

    public DataWriter2(String outputFile) throws IOException {
        dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
    }

    public void write(Student student) throws IOException {
        dataOutput.writeUTF(student.getName());
        dataOutput.writeBoolean(student.getGender());
        dataOutput.writeInt(student.getAge());
        dataOutput.writeFloat(student.getGrade());
    }

    public void save() throws IOException {
        dataOutput.close();
    }

    public static void main(String[] args) {

        String outputFile = "student.txt";

        List<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("Alice", false, 23, 80.5f));
        listStudent.add(new Student("Brian", true, 22, 95.0f));
        listStudent.add(new Student("Carol", false, 21, 79.8f));

        try {
            DataWriter2 writer = new DataWriter2(outputFile);

            for (Student student : listStudent) {
                writer.write(student);
            }

            writer.save();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
}

class Student {

    private String name;
    private boolean gender;	// true is male, false is female
    private int age;
    private float grade;

    public Student() {
    }

    public Student(String name, boolean gender, int age, float grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return this.grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}

package source.NIO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader2 {

    DataInputStream dataInput;

    public DataReader2(String inputFile) throws IOException {
        dataInput = new DataInputStream(new FileInputStream(inputFile));
    }

    public List<Student> readAll() throws IOException {
        List<Student> listStudent = new ArrayList<>();

        try {
            while (true) {
                String name = dataInput.readUTF();
                boolean gender = dataInput.readBoolean();
                int age = dataInput.readInt();
                float grade = dataInput.readFloat();

                Student student = new Student(name, gender, age, grade);
                listStudent.add(student);
            }
        } catch (EOFException ex) {
            // reach end of file
        }

        dataInput.close();

        return listStudent;
    }

    public static void main(String[] args) {
        

        String inputFile = "student.txt";

        try {
            DataReader2 reader = new DataReader2(inputFile);

            List<Student> listStudent = reader.readAll();

            for (Student student : listStudent) {
                System.out.print(student.getName() + "\t");
                System.out.print(student.getGender() + "\t");
                System.out.print(student.getAge() + "\t");
                System.out.println(student.getGrade());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

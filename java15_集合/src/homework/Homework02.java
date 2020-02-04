package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework02 {

    public static void main(String[] args) {
        List<  String> rowdata;
        List<  List<String>> data;

        rowdata = new ArrayList();
        data = new ArrayList();

        try {
            File file = new File("條碼.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str;
            String[] arr;
            while ((str = br.readLine()) != null) {
                rowdata = new ArrayList();
                arr = str.split(",");
                for (int i = 0; i < arr.length; i++) {
                    rowdata.add(arr[i]);
                }
                data.add(rowdata);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        int numColumns = rowdata.size();
        int numRows = data.size();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

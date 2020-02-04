package source;

public class Grade {

    public int[] grades;

    public final void setGrades(int[] g) { //不得覆蓋此方法
        if (grades == null) {
            grades = g;
        } else {
            System.out.println("考試次數已確定，不得更改！");
        }
    }

    public double average() {
        if (grades == null) {
            return 0;
        }
        int tot = 0;
        for (int i = 0; i < grades.length; i++) {
            tot = tot + grades[i];
        }
        return (double) tot / grades.length;
    }
   
}

class Grade2 extends Grade {

    public double average() {
        if (grades == null) {
            return 30;
        }
        int tot = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 45 && grades[i] < 60) {
                grades[i] = 60;
            }
            tot = tot + grades[i];
        }
        return (double) tot / grades.length;
    }
}

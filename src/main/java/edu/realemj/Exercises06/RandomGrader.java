package edu.realemj.Exercises06;

public class RandomGrader {

    public static double getRandomGrade() {
        int grade = 50 + (int)(51*Math.random());
        return grade;
    }

    public static String getLetterGrade(double grade) {
        String letter = "F";
        if(grade >= 90) {
            letter = "A";
        }
        else if(grade >= 80) {
            letter = "B";
        }
        else if(grade >= 70) {
            letter = "C";
        }
        else if(grade >= 60) {
            letter = "D";
        }

        return letter;
    }

    public static void printStudentGrade(
            String studentName,
            double studentGrade,
            String studentLetter) {

        System.out.println(studentName + ": " + studentLetter
                            + " (" + studentGrade + ")");
        return;
    }

    public static void main(String [] args) {
        int studentCnt = 10;
        double sumGrades = 0;

        for(int i = 0; i < studentCnt; i++) {
            double grade = getRandomGrade();
            String letter = getLetterGrade(grade);
            printStudentGrade(
                    "Student " + i,
                    grade, letter);
            sumGrades += grade;
        }

        double aveGrade = sumGrades/studentCnt;
        printStudentGrade("AVERAGE",
                aveGrade,
                getLetterGrade(aveGrade));

    }
}

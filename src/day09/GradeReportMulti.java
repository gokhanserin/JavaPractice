package day09;

public class GradeReportMulti {

    public static void main(String[] args) {

        int score = 59;  // score 0 ~~ 100
        char grade;

        if (score>=90 && score<=100) {
            grade = 'A';
        }else if (score>=80 && score<=89) {
            grade = 'B';
        }else if (score>=70 && score<=79) {
            grade = 'C';
        }else if (score>=60 && score<=69) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);

        /*
        1. grade report ==> A, B, C, D, F
         */
    }

}

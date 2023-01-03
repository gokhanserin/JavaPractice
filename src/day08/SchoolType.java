package day08;

public class SchoolType {

    public static void main(String[] args) {

        byte grade_level = 13;

        if (grade_level >= 1 && grade_level <= 5) {
            System.out.println("Elementary school");
            }

        if (grade_level >= 6 && grade_level <= 8) {
                System.out.println("Middle school");
            }
        if (grade_level >= 9 && grade_level <= 12) {
                System.out.println("High school");
            }
        if (grade_level >= 13 && grade_level <= 16) {
                System.out.println("College");
        }
        if (grade_level >= 17 && grade_level <= 18){
            System.out.println("Grad school");
        }

        /*
        2.  Given a grade_level(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given grade_level is 1 ~ 18
         */

    }

}

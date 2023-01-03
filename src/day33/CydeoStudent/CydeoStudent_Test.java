package day33.CydeoStudent;

import day33.CydeoStudent.CydeoStudent;

public class CydeoStudent_Test {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Josh",25,128,25,9,'F','A');

        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolName();

        System.out.println(student1);

        student1.printProgLanguage();
        student1.printSchoolName();


    }


}

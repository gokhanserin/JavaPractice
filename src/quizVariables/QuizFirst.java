package quizVariables;

public class QuizFirst {
    public static void main(String[] args) {

        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3 + 4));

        System.out.println("---------------------------------");

        int ivar = 100;
        double dvar = 123;
        float fvar = 200.0f;
        ivar = (int) fvar;
        fvar = ivar;
        dvar = fvar;
        fvar = (float) dvar;
        dvar = ivar;
        ivar = (int) dvar;

        System.out.println("ivar = " + ivar);
        System.out.println("dvar = " + dvar);
        System.out.println("fvar = " + fvar);

        System.out.println("-----------------------------");


        float a = 100.987_6543f;

        System.out.println(a);


        System.out.println("-----------------------------");

        System.out.println(10 / 3);


    }

}


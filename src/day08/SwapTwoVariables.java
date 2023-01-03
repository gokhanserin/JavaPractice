package day08;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = ++a;
        a = ++a;
        a = ++a;
        a = ++a;
        a = ++a;

        b = --b;
        b = --b;
        b = --b;
        b = --b;
        b = --b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

/*
    Write a program that can swipe two variables' value without using a temporary variable
 */
    }

}

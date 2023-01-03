package day15;

public class Factorial {

    public static void main(String[] args) {

    int factorial = 1;
    int number = 3;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }

}
/*
4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
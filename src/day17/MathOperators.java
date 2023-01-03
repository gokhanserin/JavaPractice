package day17;

import java.util.Scanner;

public class MathOperators {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number:");
        int number2 = input.nextInt();

        System.out.println("Enter math operator:");
        String operator = input.next();

        while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))){
            System.out.println("Invalid operator. Re-enter an operator:");
            operator = input.next();
        }

        int result = 0;
        if (operator.equals("+")){
            result = number1 + number2;
        }
        if (operator.equals("-")){
            result = number1 - number2;
        }
        if (operator.equals("*")){
            result = number1 * number2;
        }
        if (operator.equals("/")){
            result = number1 / number2;
        }

        System.out.println("result = " + result);
    }
}
/*
3. write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
 */
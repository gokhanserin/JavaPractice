package day16;

import java.util.Scanner;

public class WithoutMultiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.println("Enter two positive numbers:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = 0;
            if (num1>0 && num2>0){
                for (int j = 1; j <=num2 ; j++) {
                    result += num1;
                }
                System.out.println(num1 + " multiplied by " + num2 + " equals " + result);
            }else{
                System.out.println("Invalid number");
            }
        input.close();
        }
    }



/*
3. Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */

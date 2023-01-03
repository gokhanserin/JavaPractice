package day17;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number=0;

        int sum = 0;

        while (number>=0) {

            System.out.println("Enter number:");
            number = input.nextInt();
            if (number<0){
                System.out.println("sum = " + sum);
            }else{
                sum += number;
                System.out.println("sum = " + sum);
            }

        }

    }

}
/*
2. Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
 */
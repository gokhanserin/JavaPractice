package day16;

import java.util.Scanner;

public class PositiveNegativeNumbers {

    public static void main(String[] args) {

        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int numbers = input.nextInt();
            if (numbers>0){
                numberOfPositives += 1;
            }
            if (numbers<0){
                numberOfNegatives += 1;
            }
        }
        System.out.println(numberOfPositives + " positive and " + numberOfNegatives + " negative" );
        input.close();
    }
}

/*
1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */
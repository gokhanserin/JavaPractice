package day12;

import java.util.Scanner;

public class CentToDollar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();
        int remcents = cents%100;
        int result = cents/100;
        if (remcents==0){
            System.out.println(cents + " cents equal to: " + result + " dollars");
        }else{
            System.out.println(cents + " cents equal to: " + result + " dollars and " + remcents + " cents");
        }
    }
}
/*
. Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */
package day13;

import java.util.Scanner;

public class TwoStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1>length2){
            System.out.println(s1);
        }else{
            System.out.println(s2);
            input.close();
        }
    }
}
/*
2. write a program that asks user to enter two strings, and print out the
longest string
 */
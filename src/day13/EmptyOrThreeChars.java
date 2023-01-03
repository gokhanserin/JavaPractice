package day13;

import java.util.Scanner;

public class EmptyOrThreeChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = input.nextLine();
        String result = " ";
        if (word.length()==0){
            result = "String is empty.";
        }else if (word.length()>3){
            result = word.substring((word.length()-3));
        }else{
            result = word;
        }
        System.out.println(result);
        input.close();
    }
}

/*
5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */
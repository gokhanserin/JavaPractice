package day14;

import java.util.Scanner;

public class WordFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        String result = "";

        if (word.charAt(0)>='0' && word.charAt(0)<='9'){
            result = "first character is digit";
        }else if (word.charAt(0)>='a' && word.charAt(0)<='z'){
            result = "first character is lowercase letter";
        }else if (word.charAt(0)>='A' && word.charAt(0)<='Z'){
            result = "first character is uppercase letter";
        }else{
            result = "first character is special character";
        }
        System.out.println(result);

    }

}
/*
5. Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
2. Ascii Table
 */
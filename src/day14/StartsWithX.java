package day14;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();

        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }
    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */
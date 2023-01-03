package day14;

import java.util.Scanner;

public class EndsWithLy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        if (word.endsWith("ly")){
            System.out.println("Really???");
        }else{
            System.out.println("Never mind");
        }


    }


}
/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */
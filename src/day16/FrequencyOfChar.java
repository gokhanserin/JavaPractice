package day16;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();
        System.out.println("Enter a character:");
        String ch = input.next();
        int freqOfChar = 0;
        for (int i = 0; i < str.length(); i++) {
            String charFromStr = "" + str.charAt(i);
            if ((charFromStr.equalsIgnoreCase(ch))){
                freqOfChar += 1;
            }
        }
        System.out.println(freqOfChar);
        input.close();
    }
}

/*
2. Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */
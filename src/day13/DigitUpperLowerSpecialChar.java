package day13;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DigitUpperLowerSpecialChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        input.close();
        char firstChar = word.charAt(0);
        String result = "";

       if (firstChar >= '0' && firstChar <= '9'){
           result = "First character is digit.";

       }else if(firstChar >= 'a' && firstChar <= 'z'){
            result = "First character is lowercase character";

       }else if (firstChar >= 'A' && firstChar <= 'Z'){
            result = "First character is uppercase character";

       }else{
            result = "First character is special character";

        }
        System.out.println(result);


    }

}

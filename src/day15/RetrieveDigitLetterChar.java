package day15;

public class RetrieveDigitLetterChar {

    public static void main(String[] args) {

        String word = "mn@#123Ab!";
        String digits="";
        String letters="";
        String specialChar="";

        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i)>=48 && word.charAt(i)<=57){
                digits += word.charAt(i);

            }else if ((word.charAt(i)>=65 && word.charAt(i)<=90) || (word.charAt(i)>=97 && word.charAt(i)<=122)){
                letters += word.charAt(i);

            }else{
                specialChar += word.charAt(i);

            }

        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChar);
    }

}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */
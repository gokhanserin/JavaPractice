package day15;

public class ReverseString {

    public static void main(String[] args) {

        String word = "Wooden Spoon";
        String reverse = "";

        for (int i = word.length()-1; i >=0  ; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse);
    }


}
/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */
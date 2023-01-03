package day15;

public class Palindrome {

    public static void main(String[] args) {

    String word = "Level";
    String reverse ="";
    String word1 = word.toLowerCase();

        for (int i = word1.length()-1; i >= 0 ; i--) {
            reverse += word1.charAt(i);

        }
        if (word1.equals(reverse)){
            System.out.println("true");

        }

    }

}
/*
8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */
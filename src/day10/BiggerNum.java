package day10;

public class BiggerNum {

    public static void main(String[] args) {

        int n1=25, n2=20, n3=35;
        String result = "";
/*
        if (n1>n2 && n1>n3){
            result = n1 + " is bigger";
        }else if (n2>n1 && n2>n3){
            result = n2 + " is bigger";
        }else if (n3>n1 && n3>n2){
            result = n3 + " is bigger";
        }
        System.out.println(result);*/

        result = (n1>n2 && n1>n3)? n1 + " is bigger" :(n2>n1 && n2>n3)? n2 + " is bigger" : n3 + " is bigger";

        System.out.println(result);


        /*
        5. Create a class called BiggerNum, write a program that checks for the
bigger of 3 numbers.
you get 3 int variables with DIFFERENT values: n1 , n2 and n3
if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
NOTE: MUST USE TERNARY
         */

    }


}

package day17;

public class DivisionOfTwoNumbers {

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 4;
        int counter = 0;

        while(number1>=number2){
            number1 -= number2;
            counter ++;
        }
        System.out.println(counter);


    }


}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */
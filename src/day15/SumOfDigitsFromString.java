package day15;

public class SumOfDigitsFromString {

    public static void main(String[] args) {

        String word = "A1B2C9";
        int sum=0;


        for (int i = 0; i <word.length() ; i++) {

            if (word.charAt(i)>='0' && word.charAt(i)<='9'){

                switch (word.charAt(i)){
                    case 48:
                        sum+=0;
                        break;
                    case 49:
                        sum+=1;
                        break;
                    case 50:
                        sum+=2;
                        break;
                    case 51:
                        sum+=3;
                        break;
                    case 52:
                        sum+=4;
                        break;
                    case 53:
                        sum+=5;
                        break;
                    case 54:
                        sum+=6;
                        break;
                    case 55:
                        sum+=7;
                        break;
                    case 56:
                        sum+=8;
                        break;
                    case 57:
                        sum+=9;
                        break;

                }
            }

        }
        System.out.println("sum = " + sum);

    }


}
/*
6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */
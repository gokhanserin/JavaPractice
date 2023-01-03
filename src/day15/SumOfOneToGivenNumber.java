package day15;

public class SumOfOneToGivenNumber {

    public static void main(String[] args) {

        int sum = 0;
        int number = 50;
        for (int i = 1; i < number+1 ; i++) {
            sum+=i;
        }
        System.out.println(sum);

    }


}
/*
3. write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275
 */
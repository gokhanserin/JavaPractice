package day52;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequencyInString {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        Map<String,Integer> result = new LinkedHashMap<>();

        String[] arr = str.split("");

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each,frequency);
        }
        System.out.println(result);

        int maxFrequency = Integer.MIN_VALUE;
        String str1 = "";

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue()>maxFrequency){
                maxFrequency=entry.getValue();
                str1 = entry.getKey();
            }
        }
        System.out.println("maxFrequency = " + maxFrequency);
        System.out.println("str1 = " + str1);
        System.out.println("Character " + str1 + " is the highest frequency");

    }




}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */

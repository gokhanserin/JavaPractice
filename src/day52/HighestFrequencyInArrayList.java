package day52;

import java.util.*;

public class HighestFrequencyInArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("java", "java", "python", "c#"));

        Map<String,Integer> result = new LinkedHashMap<>();


        int maxFrequency = Integer.MIN_VALUE;
        String str = "";

        for (String each : list) {

            int frequency = Collections.frequency(list,each);

            result.put(each,frequency);

            /*if (frequency>maxFrequency){
                maxFrequency=frequency;
                str = each;
            */
            }
        
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue()>maxFrequency){
                maxFrequency = entry.getValue();
                str = entry.getKey();
        }

        }

        System.out.println("result = " + result);
        System.out.println("maxFrequency = " + maxFrequency);
        System.out.println("Element " + str + " has the highest frequency ");


    }


}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency
 */

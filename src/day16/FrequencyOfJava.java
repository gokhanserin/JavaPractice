package day16;

public class FrequencyOfJava {

    public static void main(String[] args) {

    String sentence = "Java Java";

    String word = "java";
    String wordCheck = "";
        int frequency = 0;

        for (int i = 0; i <= sentence.length()-word.length(); i++) {
            wordCheck = sentence.substring(i,i+word.length());



            if (word.equalsIgnoreCase(wordCheck)){
                frequency += 1;

            }

        }

        System.out.println(frequency);


    }


}

/*
4. write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */
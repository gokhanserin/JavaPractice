package day16;

public class CatAndDogs {

    public static void main(String[] args) {
        String sentence = "caT dog dogG cAt";
        String word1 = "cat";
        String word2 = "dog";
        String str3char = "";
        int numberOfCat = 0;
        int numberOfDog = 0;

        for (int i = 0; i <= sentence.length()-3 ; i++) {
            str3char = sentence.substring(i, i+3);
            if (str3char.equalsIgnoreCase("cat")){
                numberOfCat ++;
            }
            if (str3char.equalsIgnoreCase("dog")){
                numberOfDog++;
            }

            }

        if (numberOfCat==numberOfDog){
            System.out.println("true");
        }
    }
}

/*
5. write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */
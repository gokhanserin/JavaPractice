package day13;

public class IsCharSame {

    public static void main(String[] args) {

        String word = "level";
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        if (firstChar==lastChar) {
            System.out.println("same");
        }
    }
}
/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */
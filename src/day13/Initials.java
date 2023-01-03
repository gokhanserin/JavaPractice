package day13;

public class Initials {

    public static void main(String[] args) {

    String firstName = "cybertek";
    String lastName = "school";
        //System.out.println((" " + firstName.charAt(0)).toUpperCase() + "." + ("" + lastName.charAt(0)).toUpperCase());
        System.out.println(firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase());

    }

}
/*
. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */
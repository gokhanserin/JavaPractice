package day17;

import java.util.Scanner;

public class RommReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");
        String answer = scan.next(). toLowerCase();

        while (!(answer.equals("yes")|| answer.equals("no") )){
            System.err.println("This is not a valid entry, please re-enter your answer: ");
            answer= scan.next().toLowerCase();
        }
        if (answer.equals("no")) {
            System.out.println("have a nice day");
        } else {
            System.out.println("Which type of room the do you want to reserve?  King Bed,  Queen Bed or  Single Bed");
            scan.nextLine();
            String type = scan.nextLine();
            while (!( (type.equals("Single Bed")) || (type.equals("Queen Bed"))|| (type.equals("King Bed"))) ){

                System.err.println("Invalid entry. Please choose room type");
                type= scan.nextLine();
            }
            if (type.equals("Single Bed")) {
                System.out.println("Your price is 80$");
            } else if (type.equals("Queen Bed")) {
                System.out.println("Your price is 100$");
            } else {
                System.out.println("Your price is 120$");
            }
        }


    }


}
/*
5. Create a class called RommReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
 */
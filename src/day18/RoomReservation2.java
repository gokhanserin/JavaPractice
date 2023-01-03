package day18;

import java.util.Scanner;

public class RoomReservation2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String anotherRoom = "";
        String bedroomType = "";
        int numberOfNight;
        int price=0;
        while (true) {
            System.out.println("Which bedroom do you want to reserve?\nKing Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
            bedroomType = input.nextLine();
            while (!(bedroomType.equalsIgnoreCase("King Bed") || bedroomType.equalsIgnoreCase("Queen Bed") || bedroomType.equalsIgnoreCase("single Bed"))) {
                System.err.println("Invalid entry! Please re-enter");
                System.out.println("Which bedroom do you want to reserve?\nKing Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
                bedroomType = input.nextLine();
            }
            System.out.println("How many nights will you stay?");
                numberOfNight = input.nextInt();
                while (!(numberOfNight > 0)) {
                System.err.println("Invalid entry! Please re-enter");
                System.out.println("How many nights will you stay?");
                numberOfNight = input.nextInt();
            }
                if (bedroomType.equalsIgnoreCase("king bed")){
                price += 120*numberOfNight;
            }if (bedroomType.equalsIgnoreCase("queen bed")){
                price += 100*numberOfNight;
            }if(bedroomType.equalsIgnoreCase("single bed")){
                price += 80*numberOfNight;
            }
            System.out.println("Would you like to reserve another room?");
            anotherRoom = input.next();
            input.nextLine();
            while (!(anotherRoom.equalsIgnoreCase("yes") || anotherRoom.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry! Please re-enter");
                System.out.println("Would you like to reserve another room?");
                anotherRoom = input.next();
                input.nextLine();
            }
            if (anotherRoom.equalsIgnoreCase("no")){
                System.out.println("Total price: " + price);
                break;
        }
        }
    }
}
/*
2. Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */
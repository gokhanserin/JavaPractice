package day13;

import java.time.LocalDate;
import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        double cost;
        cost = 1000;

        Scanner input = new Scanner(System.in);

        System.out.println("Which country will you travel?");
        String country = input.nextLine();

        System.out.println("How many bags you will take?");
        byte numberOfbags = input.nextByte();

        cost += 50*numberOfbags;

        System.out.println("How many people you will travel with?");
        short numberOfPeople = input.nextShort();
        if (numberOfPeople <= 3){
            cost -= 100*numberOfPeople;
        }
        input.nextLine();
        System.out.println("Enter the name of the people you will travel with in one line, separating each name with a comma:");
        String people = input.nextLine();

        System.out.println("Do you have a valid passport? (yes or no)");
        String validPassport = input.next();
        if (validPassport.equals("yes")){
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " +
                            numberOfbags + " bags but you are traveling with " +
                            numberOfPeople + " people so we are giving a discount. Your total cost is $" + cost + ".");

        }else{
            double costPassportRenewal = 200;
            System.out.println("When your passport expired?");
            int expireYear = input.nextInt();
            int numOfExpireYear = 2022 - expireYear;
            cost += costPassportRenewal + numOfExpireYear*75;

            System.out.println("Will you traveling in the next year (yes or no)");
            String nextYearTravel = input.next();

            if (nextYearTravel.equals("yes")){
                cost += 100;
            }else{
                cost -= 50;
            }

            System.out.println("Looks like your password has been expired for " + numOfExpireYear +
                    " years, but not to worry we will get it ready for you to travel to "+ country +
                    " .Your total cost has come out to $" + cost + ".");
        }

    }

}
/*
3. Create a class calledTravel. Make a cost variable to calculate how
much the person will owe after everything.
Ask the user if they have a valid passport (yes or no)
If the user enters yes:
The base cost of the ticket
should be set to: 1000
Ask the user the country they to travel to
(String, multiple word)
Ask the user how many bags they will take
with them (byte)
> Each bag will add 50 to the cost
Ask the user how many people they will travel
with (short)
> For each person the cost is
reduced by 100. Up to a limit of 300.
Ask the user to Enter the name of the people
they will travel with in one line, separating each name with a comma
(String, multiple word)
Print: "Your ticket is booked to
$countryName. We have charged extra for the $numberOfBags bags but you are
traveling with $peopleYouTravelWith so we are giving a discount. Your
total cost is $costAmount"
If the user enters no:
The base cost of the passport
renewal is: 200
            Ask the user when their passport
expired(int)
                > Each year it was
expired adds 75 to the cost
Ask the user which country they plan to
travel
            Ask the user if they will be
traveling in the next year (String - yes or no)
                > If yes: add 100 to
the cost
                > If no: subtract 50
from the cost
Print: "Looks like your password has
been expired for $years, but not to worry we will get it ready for you to
travel to $allCountries. Your total cost has come out to $costAmount."
 */
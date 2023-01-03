package day17;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        double price = 0;

        System.out.println("Enter your gender: M/F");
        String gender = input.next().toLowerCase();

        while (!(gender.equals("m") || gender.equals("f"))) {
            System.err.println("Invalid entry! Please re-enter");
            System.out.println("Enter your gender: M/F");
            gender = input.next().toLowerCase();
        }

        System.out.println("Are you married? (yes/no)");
        String married = input.next().toLowerCase();

        while (!(married.equals("yes") || married.equals("no"))){
            System.err.println("Invalid entry! Please re-enter");
            System.out.println("Are you married? (yes/no)");
            married = input.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while (!(age>0 && age<=120)){
            System.err.println("Invalid entry! Please re-enter");
            System.out.println("Enter your age:");
            age = input.nextInt();
        }
        System.out.println("How many miles do you drive in a day?");
        int miles = input.nextInt();

        while (!(miles>=5)){
            System.err.println("Invalid entry! Please re-enter");
            System.out.println("How many miles do you drive in a day?");
            miles = input.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance?");
        input.nextLine();
        String insuranceType = input.nextLine();

        System.out.println("had any accidents or claims in past 5 years (Yes/No)");
        String accident = input.next().toLowerCase();

        while (!(accident.equals("yes") || accident.equals("no"))){
            System.err.println("Invalid entry! Please re-enter");
            System.out.println("had any accidents or claims in past 5 years (Yes/No)");
            accident = input.next().toLowerCase();
        }

        System.out.println("Your car has an anti-theft device (Yes/No)");
        String antiTheft = input.next();

        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))){
            System.err.println("Invalid entry! Please re-enter");
            System.out.println("Your car has an anti-theft device (Yes/No)");
            antiTheft = input.next();
        }

        if (insuranceType.equals("liability")){
            if (age<25){
                price += 90;
            }else{
                price += 50;
            }
            if (miles<=10){
                price += 10;
            }else if (miles>10 && miles<=50){
                price +=30;

            }else{
                price += 50;
            }
        }else{
            if (age<25){
                price += 160;
            }else{
                price += 120;
            }
            if (miles<=10){
                price += 20;
            }else if (miles>10 && miles<=50){
                price +=40;

            }else{
                price += 70;
            }
        }
        if (antiTheft.equals("yes"))
            price -= price*0.05;

        if (accident.equals("yes")){
            price += price*0.15;
        }else{
            price -= price*0.10;
        }

        if (married.equals("yes"))
            price -= price*0.05;

        System.out.println("Your name: " + name);
        System.out.println("Gender: "+ gender);
        System.out.println("Are you married? "+married);
        System.out.println("Age:" + age);
        System.out.println("Drive in a day: "+ miles);
        System.out.println("Insurance type:"+insuranceType);
        System.out.println("Accidents: "+accident);
        System.out.println("Anti-theft device: "+antiTheft);
        System.out.println("Your total price is "+price);

        input.close();

    }

}
/*
6. Create a class called InsuranceQuote, write a program that can
calculate the insurance cost of a person based on the following info:
1. Ask the user to enter your name
2. Ask the user to enter your gender
(if user enters invalid entry, ask the user
to re-enter until user provides a valid entry)
3. Ask the user if he/she is married(Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
4. Ask user to enter your age
(age can not be negative or
greater than 120)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
5. Ask user to enter how many miles he/she
drives in a day
(mileage can not be negative
or less than 5)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
6. Ask the user if he/she wants full coverage
or liability insurance?
7. Ask if he/she had any accidents or claims
in past 5 years (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
8. Ask the user if his/her car has an anti-
theft device (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
Calculate the price of the insurance and display all the
info of the user
Insurance Quote calculation:
starting prices for liability:
age < 25 ===> 90
age >= 25 ==> 50
miles <= 10 ====> $10
    miles > 10 and miles <= 50 ==>
$30
    miles > 50 ===>  $50
starting prices for full coverage:
age < 25 ===> 160
age >= 25 ==> 120
miles <= 10 ====> $20
    miles > 10 and miles <= 50 ==>
$40
    miles > 50 ===>  $70
    If the car has anti-theft device ==> 5%
discount
    If he/she had any accidents or claims in
past 5 years ===> 15% extra charge
    If he/she never had any accidents or
claims in past 5 years ==> 10% discount
    If he/she is married ==> 5% discount
 */
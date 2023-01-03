package day14;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        System.out.println("Enter your account number:");
        String accountNumber = new Scanner(System.in).next();
        String result = "";

        if (accountNumber.length() == 7) {
            switch (accountNumber.charAt(0)) {
                case '2':
                    result = "Valid account number";
                    break;
                default:
                    result = "Invalid account number";
            }
        }else if (accountNumber.length() == 10) {
                switch (accountNumber.charAt(0)) {
                    case '5':
                        result = "Valid account number";
                        break;
                    default:
                        result = "Invalid account number";
                }
        }else{
                    result = "Invalid account number";

                }

        System.out.println(result);

    }

}
/*
7. Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
account numberâ
 */
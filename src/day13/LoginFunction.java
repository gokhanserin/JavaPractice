package day13;

import java.util.Scanner;

public class LoginFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username:");
        String username1 = input.next();
        System.out.println("Enter password:");
        String password1 = input.next();

        String username = "Cydeo";
        String password = "WoodenSpoon";

        if ((username1.equals(username)) && (password1.equals(password))){
            System.out.println("Logged in");
        }else{
            System.err.println("Incorrect username or password");
        }
    }
}
/*
. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method
 */
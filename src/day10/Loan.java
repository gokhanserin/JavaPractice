package day10;

public class Loan {

    public static void main(String[] args) {

        int salary = 80000;
        int creditScore = 600;
        String result = "";

        result = (salary>60000 && creditScore>650)? "Loan approved" : "Loan denied";
        System.out.println(result);

        /*  // Alternative solution
        boolean validSalary = salary>60000;
        boolean validscore = creditScore>650;
        result = (validSalary && validscore)? "Loan approved" : "Loan denied";
        */


    /*
    6. Create a class called Loans, Given two variables salary and credit
score, use those given info to determine if you can get a loan.
To be approve for the loan, print: "Loan Approved":
Salary: above 60,000
Credit Score: above 650
Otherwise print: "Loan Denied"
NOTE: MUST USE TERNARY.
     */

    }


}

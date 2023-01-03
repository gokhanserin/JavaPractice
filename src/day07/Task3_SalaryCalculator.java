package day07;

public class Task3_SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double stateTax = stateTaxRate / 100 * salaryBeforeTax;
        double totalTax = federalTax + stateTax;
        double netIncome = salaryBeforeTax - totalTax;


        System.out.print("Gross pay is: " + "$" + salaryBeforeTax);
        System.out.print("\nFederal tax is: " + "$" + federalTax);
        System.out.print("\nState tax is: " + "$" + stateTax);
        System.out.println("\nTotal tax is: " + "$" + totalTax);
        System.out.println("Net income is: " + "$" + netIncome);


        /*
        3. Create a class called SalaryCalculator.java
3.1 declare the following variables:
hourlyRate, weeklyHours,
stateTaxRate, federalTaxRate
3.2 use the given info in above variables to
calculate the followings:
1. salaryBeforeTax
2. stateTax
3. federalTax
4. totalTax
5. salaryAfterTax
Hint: salaryBeforeTax =
hourlyRate * weeklyHour * 52
3.3 use print statement to print each of the
above
Ex:
   hourlyRate = $50
   weeklyHours = 45
   stateTaxRate = 6
(given as percentage, you need to convert to decimal)
   federalTaxRate = 26
(given as percentage, you need to convert to decimal)
    output:
    Gross pay is: $117000
    Federal tax is: $30420
    State tax is: $7020
    Total tax is: $37440
    Net income is: 79560
         */


    }


}

package day09;

public class SalaryAfterTax {

    public static void main(String[] args) {

        int salary = 70000;
        boolean isMarried = true;
        double taxRate1;
        double taxRate2;
        double taxRate3;
        double taxRate4;

        if (isMarried == false){
            taxRate1 = 35;
            taxRate2 = 30;
            taxRate3 = 25;
            taxRate4 = 20;
        }else{
            taxRate1 = 35 - 5;
            taxRate2 = 30 - 5;
            taxRate3 = 25 - 5;
            taxRate4 = 20 - 5;
        }

        double tax1 = taxRate1 / 100 * salary;
        double tax2 = taxRate2 / 100 * salary;
        double tax3 = taxRate3 / 100 * salary;
        double tax4 = taxRate4 / 100 * salary;

        double netIncome1 = salary - tax1;
        double netIncome2 = salary - tax2;
        double netIncome3 = salary - tax3;
        double netIncome4 = salary - tax4;

        if (salary >= 130000){
            System.out.println("Net income: " + netIncome1);
        }else if (salary >= 100000 && salary < 130000){
            System.out.println("Net income: " + netIncome2);
        }else if (salary >= 80000 && salary < 100000){
            System.out.println("Net income: " + netIncome3);
        }else{
            System.out.println("Net income: " + netIncome4);
        }

        /*
        2. Write a program that can calculate the salary after tax based on the following requirements
the tax rates are:
    35% for salary of 130K or more
    30% for salary of 100K to 130k (excluded)
    25% for salary of 80K to 100K (excluded)
    20% for salary less than 80K
in addition, if the person is married, he/she will pay 5% less tax
         */
    }
}

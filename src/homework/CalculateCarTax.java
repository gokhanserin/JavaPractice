package homework;

public class CalculateCarTax {

    public static void main(String[] args) {

        int price = 40000;
        double taxRate1 = 0.2;
        double taxRate2 = 0.3;
        double taxRate3 = 0.4;

        double carTax1 = taxRate1 * price;
        double carTax2 = taxRate2 * price;
        double carTax3 = taxRate3 * price;
        double result;

        if (price>=20000 && price<=80000){
            if (price>=20000 && price<=39999){
                result = carTax1;
            }else if (price>=40000 && price<=59999){
                result = carTax2;
            }else{
                result = carTax3;
            }
            System.out.println("Car tax is: $" + result);
        }else{
            System.out.println("Invalid price");
        }
        /*
        Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
         */
    }
}

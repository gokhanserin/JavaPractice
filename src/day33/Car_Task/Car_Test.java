package day33.Car_Task;

public class Car_Test {

    public static void main(String[] args) {

        Car car1 = new Car("Opel","Astra","white",2019,12000);

        System.out.println(car1);

        car1.drive();

        System.out.println(car1.hasSeats);
        System.out.println(car1.hasBattery);


    }


}

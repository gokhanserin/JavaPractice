package day44;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Corolla",2010,15000,"white");
        System.out.println(toyota);
        toyota.drive();
        toyota.start();
        toyota.setColor("black");
        toyota.setPrice(20000);
        System.out.println(toyota.getColor());
        System.out.println(toyota.getPrice());

        System.out.println("----------------------------------------");

        CydeoCar cydeocar = new CydeoCar("Cydeocar","trend1",2022,40000,"green");
        System.out.println(cydeocar);
        cydeocar.drive();
        cydeocar.start();
        cydeocar.fly();
        cydeocar.autoPark();
        cydeocar.selfDrive();
        cydeocar.stop();
        cydeocar.setColor("blue");
        cydeocar.setPrice(45000);


    }

}

package day44;

public final class CydeoCar extends Car implements AutoPilot, Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " can do autopark");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " makes selfdriving.");

    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with eye contact");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " drives without a driver");

    }

    @Override
    public void fly() {
        System.out.println(getMake()+ " " + getModel() + " can fly");

    }
}

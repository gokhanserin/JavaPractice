package day44;

public final class Toyota extends Car {


    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with switch key");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " drives with a driver");

    }
}

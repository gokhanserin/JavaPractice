package day44;

public final class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is starting by voice");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " drives automatically");

    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has autopark feature");
    }
}

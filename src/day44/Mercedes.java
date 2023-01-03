package day44;

public final class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " autoparks without the driver");

    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starts with touching");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " drives by voice");

    }
}

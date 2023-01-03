package day33.iPhone_Task;

public class IPhone {

    public String model, color, size;
    public double price;

    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";

    public IPhone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + model + " is doing faceTime call with " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + model + " is doing faceTime call with " + email);
    }
    public void call(long phoneNumber){
        System.out.println(brand + model + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand + model + " is writing text messages to " + phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
/*
4. IPhone Task:
		1. Create a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */

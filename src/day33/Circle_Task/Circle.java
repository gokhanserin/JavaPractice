package day33.Circle_Task;

public class Circle {

    public double radius, diameter;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2*radius;
    }

    public double calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return pi*diameter;
    }
    public static void printPi(){
        System.out.println("Pi: " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Circle Task:
1. Create a class named Circle:
Attributes:
    instance: radius, diameter
    static: pi
Add a constructor that can set All the fields (instances)
HINT: we only need to know the radius to set the radius & diameter
Actions:
    calcArea(): returns the area of Circle
    calcPerimeter(): returns the perimeter of Circle
    printPi(): displays PI value
    toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of
circle is passed in the print statement
 */

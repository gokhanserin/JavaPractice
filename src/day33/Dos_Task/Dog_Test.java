package day33.Dos_Task;

public class Dog_Test {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max","Kangal","Medium","brown",'M',3);

        System.out.println(dog1);

        System.out.println(dog1.color);
        System.out.println(dog1.isFriendly);

        dog1.play();
        dog1.sleep();

        System.out.println(Dog.numberOfEyes);
        System.out.println(dog1.numberOfLegs);
        System.out.println(Dog.numberOfWings);


    }


}

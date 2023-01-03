package day33.Person;

public class Person_Test {

    public static void main(String[] args) {

        Person person1 = new Person("Kelly",29,'F');

        person1.drink("tea");
        person1.eat("hamburger");
        person1.sleep();
        System.out.println(person1.isHuman);

        int head = person1.numberOfHead;
        System.out.println(head);

        System.out.println(Person.numberOfEyes);


    }


}

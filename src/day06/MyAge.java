package day06;

import java.time.LocalDate;

public class MyAge {

    public static void main(String[] args) {

        int birth_year = 1977;
        LocalDate today = LocalDate.now();
        int current_year = today.getYear();
        int age = current_year - birth_year;
        System.out.println("age = " + age);

    }

}

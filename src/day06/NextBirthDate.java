package day06;

import java.time.LocalDateTime;
import java.time.MonthDay;

public class NextBirthDate {

    public static void main(String[] args) {

        MonthDay today = MonthDay.now();
        System.out.println("today = " + today);
        MonthDay birth_day = MonthDay.of(04,11);

        //int rem_time_for_birthday = birth_day - today;
        // System.out.println("rem_time_for_birthday = " + rem_time_for_birthday);


    }


}

package Java_Time.LocalDate.Example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Create_LocalDate {
    public static void main(String[] args) {


    LocalDate date = LocalDate.of(2017, 9, 21);
    int year = date.getYear();
    Month month = date.getMonth();
    int day = date.getDayOfMonth();
    DayOfWeek dow = date.getDayOfWeek();
    int len = date.lengthOfMonth();
    boolean leap = date.isLeapYear();


  //  It's also possible to obtain the current date from the system clock by using the now factory method:
    LocalDate today = LocalDate.now();

        System.out.println(today);

    }
}

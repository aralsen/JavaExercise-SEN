package sen.aral.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeExample2 {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println("Date after 25 days "+date.plusDays(25));
        System.out.println("Date after 15 months "+date.plusMonths(15));
        System.out.println("Date after 5 years "+date.plusYears(5));

        System.out.println("Date before 25 days "+date.minusDays(25));
        System.out.println("Date before 15 months "+date.minusMonths(15));
        System.out.println("Date before 5 years "+date.minusYears(5));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("Time before 2hrs "+dateTime.minusHours(5));
        System.out.println("Date after 28 days "+dateTime.plusDays(28));
    }
}

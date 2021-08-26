package sen.aral.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeExample1 {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(date));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //get day , month, year
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        //get hr, min, sec
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime futureDateTime = LocalDateTime.of(2021, Month.AUGUST, 25, 9, 30, 22);
        DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(timeformatter.format(futureDateTime));
    }
}

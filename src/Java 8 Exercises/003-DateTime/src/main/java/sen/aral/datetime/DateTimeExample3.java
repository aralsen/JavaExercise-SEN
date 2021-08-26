package sen.aral.datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeExample3 {
    public static void main(String[] args)
    {
        // Get the total experience of an employee in years
        LocalDate todayDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2015, 7, 16);

        //Years of experience
        Period period = Period.between(startDate, todayDate); // startDate is inclusive and todayDate is exclusive
        System.out.println("Your years of experience is "+period.getYears());

        System.out.printf("Total experience is %d years, %d months, %d days ",period.getYears(), period.getMonths(), period.getDays());
    }
}

package DateAndTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeExample 
{
public static void main(String[] args) {
    LocalDateTime ldt=LocalDateTime.now();
    String format=ldt.format(DateTimeFormatter.ISO_DATE_TIME);
    
    System.out.println(format);
    System.out.println("         ");
    LocalDateTime yesterday=ldt.minusDays(1);
    LocalDateTime tomorrow=ldt.plusDays(2);
    int year=ldt.getYear();
    Month month=ldt.getMonth();
    int day=ldt.getDayOfMonth();
    System.out.println(year+":"+month+":"+day);
    System.out.println(yesterday);
    System.out.println(tomorrow);
    System.out.println("year:"+ldt.getYear());
    System.out.println("Month:"+ldt.getMonth());
    System.out.println("Day:"+ldt.getDayOfMonth());
    System.out.println(ldt);
}    
}

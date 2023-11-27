package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingDemo
{
public static void main(String[] args) {
   LocalDateTime ldt=LocalDateTime.now();
    System.out.println("Before Formatting :"+ldt);
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:a");
    String formatDemo=ldt.format(dtf);
    System.out.println("After Formatting :"+formatDemo);
}    
}

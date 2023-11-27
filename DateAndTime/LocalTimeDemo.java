package DateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo
{
    public static void main(String[] args) {
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalTime time=lt.minusHours(2);
        LocalTime time1=time.minusMinutes(30);
        System.out.println(time1);

    }
}

package DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimeZone 
{
public static void main(String[] args) {
    ZoneId zone=ZoneId.of("Asia/Kolkata");
    LocalTime lt=LocalTime.now(zone);
    System.out.println("Indian Time Zone: "+lt);
    ZoneId zone1=ZoneId.of("Asia/Tokyo");
    LocalTime lt1=LocalTime.now(zone1);
    System.out.println("Japan Time Zone: "+lt1);
}    
}    


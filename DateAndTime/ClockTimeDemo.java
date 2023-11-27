package DateAndTime;

import java.time.Clock;
import java.time.Duration;

public class ClockTimeDemo
{
    public static void main(String[] args) {
        Clock c=Clock.systemUTC();
        System.out.println(c.instant());
       Clock c1=Clock.systemDefaultZone();
       System.out.println(c1.getZone());
        Duration d=Duration.ofHours(2);
       Clock c2=Clock.offset(c,d);
       System.out.println(c2.instant());
       }
}

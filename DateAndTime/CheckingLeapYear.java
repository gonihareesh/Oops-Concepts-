package DateAndTime;

import java.time.LocalDate;



public class CheckingLeapYear 
{
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2056, 6, 22);
        System.out.println(ld.isLeapYear());
         LocalDate ld1=LocalDate.of(2055, 6, 22);
        System.out.println(ld1.isLeapYear());
    }


   
}

package Enum;
enum Today{
    SUNDAY,MONDAY,TUSEDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumWithSwitch {
    public static void main(String[] args) {
        Today day=Today.FRIDAY;
        switch(day){
            case MONDAY:
                System.out.println("today is "+day);
                break;
            case TUSEDAY:
                System.out.println("Today is "+day);
                break;
            case WEDNESDAY:
                System.out.println("Today is "+day);
                break;
            case THURSDAY:
                System.out.println("Today is "+day);
                break;
            case FRIDAY:
                System.out.println("Today is "+day);
                break;
            case SATURDAY:
                System.out.println("Today is "+day);
                break;
            case SUNDAY:
                System.out.println("Today is "+day);
                break;
            default:
                System.out.println("You entered wrong ");
        }
    }
}

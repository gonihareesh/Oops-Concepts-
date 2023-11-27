package Enum;
//enum is contain a fixed set of constants
enum Season{
    WINTER, SPRING, SUMMER, FALL
}
public class SeasonsEnum {
    public static void main(String[] args) {
        Season s=Season.WINTER;
        switch(s){
            case WINTER :
            System.out.println("the season is "+s);
            break;
            case SPRING:
                System.out.println("the season is "+s);
                break;
            case SUMMER:
                System.out.println("the season is "+s);
                break;
            case FALL:
                System.out.println("the season is "+s);
                break;
        }
    }


}

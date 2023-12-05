package ExceptionHandling;

public class ExceptionDemo
{
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("remaining code...");
    }
}

package ExceptionHandling;

public class ExceptionDemo5
{
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());
        }
        catch(NullPointerException ne){
            System.out.println("NullPointerException is occurs");
        }
finally{
            System.out.println("this is final Keyword.");
        }
    }
}

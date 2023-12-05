package ExceptionHandling;
//multiple catch blocks
public class ExceptionDemo4
{
    public static void main(String[] args) {

        try {
            int a[] = new int[4];
            a[5] = 30 / 0;//we have 2 exceptions Arithmetic Exception and ArrayIndexOutOfBounds Exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(ArithmeticException e1)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(Exception e3){
            System.out.println("Exception occurs");
        }
    }
}

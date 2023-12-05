package ExceptionHandling;

public class ExceptionDemo1
{
    public static void main(String[] args) {
        int i=50;
        int j=0;
try {
    int data;
    data = i / j;
}
catch(ArithmeticException e){
    System.out.println(e);

        }
        System.out.println(i/(j+2));
    }
}

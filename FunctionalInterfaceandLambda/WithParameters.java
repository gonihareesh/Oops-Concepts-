package FunctionalInterfaceandLambda;
interface Demo{
    int addition(int a,int b);
}
public class WithParameters {
    public static void main(String[] args) {
        Demo d=(a,b)->(a+b);
            System.out.print(d.addition(10, 12));
        }
    }


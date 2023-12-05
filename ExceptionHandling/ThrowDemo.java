package ExceptionHandling;

public class ThrowDemo
{
    public void numberValidation(int num){
        if(num<1){
            throw new ArithmeticException("number is negative it can't be calculate the square");
        }else{
            System.out.println("Square of "+num+" is "+(num*num));
        }
    }

    public static void main(String[] args) {
        ThrowDemo td=new ThrowDemo();
       // td.numberValidation(-3);
        td.numberValidation(17);
    }
}

package OOps;

public class SimpleCalculator1 {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public int getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public int getSubstractionResult(){
        return firstNumber-secondNumber;
    }
    public int getMultipleResult(){
        return firstNumber*secondNumber;
    }
    public int getDevisionResult(){
        return firstNumber/secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator1 sc=new SimpleCalculator1();
        sc.setFirstNumber(12);
        sc.setSecondNumber(24);
        System.out.println("results of 2 numbers:"+sc.getAdditionResult());
        System.out.println("results of 2 numbers:"+sc.getSubstractionResult());
        System.out.println("results of 2 numbers: "+sc.getMultipleResult());
        System.out.println("results of 2 number:"+sc.getDevisionResult());
    }
}

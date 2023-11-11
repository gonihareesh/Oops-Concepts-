package OOps;

public class CarTest
{
    public static void main(String[] args) {
        FirstClass fc=new FirstClass();
        fc.setMake("ALTO");
        fc.setModel("Tesla-n290");
        System.out.println("make "+fc.getMake());
        System.out.println("model "+fc.getModel());
        fc.describeCar();
    }
}

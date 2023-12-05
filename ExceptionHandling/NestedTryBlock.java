package ExceptionHandling;

public class NestedTryBlock
{
    public static void main(String[] args) {
        try {
            System.out.println("Outer Try block");

            int arr[] = new int[5];
            arr[10] = 50;
            try {
                System.out.println("Inner try block...");
                String line = null;
                int length = line.length();
            } catch (NullPointerException ne) {
                System.out.println("Inner block :" + ne.getMessage());
            }
        }catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Outer try block: " + ae.getMessage());
            } finally {
                System.out.println("Final block message");
            }
        }
    }


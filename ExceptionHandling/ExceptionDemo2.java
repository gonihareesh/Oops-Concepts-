package ExceptionHandling;

public class ExceptionDemo2
{
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{

            arr[0]=11;
            arr[1]=15;
            arr[2]=45;
            arr[3]=9;
            arr[4]=36;
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(arr[5]+" "+e);
        }
//System.out.println(arr[4]);


    }
}

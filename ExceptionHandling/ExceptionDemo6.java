package ExceptionHandling;
//try with finally block..
public class ExceptionDemo6
{
    public static void main(String[] args) {
        int arr[]={5,2,0,1,10};
        for (int i=0;i< arr.length;i++){
            try{
                int result=10/arr[i];
            System.out.println("Result for index "+i+" : "+result);
            }finally {
                System.out.println("Final block.."+i);
            }
        }
    }
}

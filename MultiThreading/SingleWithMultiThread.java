package MultiThreading;

public class SingleWithMultiThread extends Thread
{
    public void run(){
        System.out.println("This is user Thread");
    }

    public static void main(String[] args) {
        SingleWithMultiThread sm=new SingleWithMultiThread();
        SingleWithMultiThread sm1=new SingleWithMultiThread();
        SingleWithMultiThread sm2=new SingleWithMultiThread();
        sm.start();
        sm1.start();
        sm2.start();
    }
}

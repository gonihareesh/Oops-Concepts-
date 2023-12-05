package MultiThreading;
class ThreadDemo5 extends Thread{
    public void run(){
        for(int i=1;i<3;i++){
            try {
                Thread.sleep(500);
                System.out.println("Current thread is "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
               System.out.println("the exception has been caught"+e);
            }
            System.out.println(i);

        }
    }
}
public class MultiThreadDemo5 {
    public static void main(String[] args) {
        //creating 3 threads ...
        ThreadDemo5 t=new ThreadDemo5();
        ThreadDemo5 t1=new ThreadDemo5();
        ThreadDemo5 t2=new ThreadDemo5();
    t.start();

        try {
            t.join(2000);
            System.out.println(Thread.currentThread().getState());
            System.out.println("Current thread name of :"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
           System.out.println("Exception has been caught"+e);
        }
        t1.start();
        try {
            t1.join();
            System.out.println("Current Thread of: "+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Current exception has been caught"+e);
        }
        t2.start();
        try {
            t2.join();
            System.out.println(Thread.currentThread().getState());
            System.out.println("Current Thread of: "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Current exception has been caught"+e);
        }

    }
}

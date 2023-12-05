package MultiThreading;

class ThreadDemo2 extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" Value of i "+i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
public class MultiThreadingDemo2 {
    public static void main(String[] args) {
        ThreadDemo2 thread=new ThreadDemo2();
        thread.start();
        ThreadDemo2 thread2=new ThreadDemo2();
        thread2.start();
    }
}

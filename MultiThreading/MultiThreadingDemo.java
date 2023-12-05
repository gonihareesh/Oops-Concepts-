package MultiThreading;
class ThreadDemo extends Thread{
    public void run() {
        for(int i=0;i<=5;i++){

            System.out.println(Thread.currentThread().getId()+" Value of i "+i);
        }

    }
}
public class MultiThreadingDemo
{
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo();
        ThreadDemo t2=new ThreadDemo();
        System.out.println(t1.getId()+" "+t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getId()+" "+t2.getName());
        t1.start();
        t2.start();
    }
}

package FunctionalInterfaceandLambda;

public class WithThreads 
{
public static void main(String[] args) {
    Runnable r=new Runnable() {
        public void run(){

            System.out.println("thread one...");
        }
    };
    Thread t1=new Thread(r);
    t1.start();
    
    Runnable r1=()->{
   System.out.println("Thread two...");

    };
    Runnable r2=()->{
        System.out.println("Thread Three");
    };
    Thread t=new Thread(r1);
    t.start();
}    
}

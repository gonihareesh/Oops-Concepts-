package MultiThreading;


public class MultiThreadWithAnnonimous {
    public static void main(String[] args) {
        //anonymous class that extends Thread class
        Thread t1=new Thread(){
            public void run(){
                System.out.println("Thread one");
            }
        };
        t1.start();
        Thread t2=new Thread(){
            public void run(){
                System.out.println("Thread Two");
            }
        };
        t2.start();
        Thread t3=new Thread(){
            public void run(){
                System.out.println("Thread Three");
            }
        };
        t3.start();
    }
}

package MultiThreading;

class Multi{
    synchronized void print(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class SynchronizedWithAnonymous
{
    //anonymous
    public static void main(String[] args) {
        Multi m=new Multi();
        Thread t=new Thread(){
            public void run(){
                m.print(8);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                m.print(17);
            }
        };
    t.start();
    t2.start();
    }
}

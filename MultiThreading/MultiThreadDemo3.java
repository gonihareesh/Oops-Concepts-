package MultiThreading;
class ThreadDemo3 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=3;i++){
            System.out.println(Thread.currentThread().getId()+" value of i: "+i);
        }
    }
}
public class MultiThreadDemo3 {
    public static void main(String[] args) {
        ThreadDemo3 t=new ThreadDemo3();
        Thread t1=new Thread(t);//we need to creat Thread class object explicitly
        t1.start();
    }

}

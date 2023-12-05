package MultiThreading;
class ThreadDemo4 implements Runnable{
    public void run(){
        System.out.println("This is first Thread");
    }
}
public class MultiThreadDemo4 {
    public static void main(String[] args) {
        ThreadDemo4 t4=new ThreadDemo4();
        Thread t=new Thread(t4,"this is main Thread");
        t.start();
        String str=t.getName();
        System.out.println(str);


    }
}

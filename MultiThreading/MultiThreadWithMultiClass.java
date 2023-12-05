package MultiThreading;
class Single1 extends Thread{
    public void run(){
        System.out.println("This is Single1 Thread");
    }
}
class Single2 extends Thread{
    public void run(){
        System.out.println("This is Single2 Thread");
    }
}
class Single3 extends Thread{
    public void run(){
        System.out.println("This is Single3 Thread");
    }
}
public class MultiThreadWithMultiClass {
    public static void main(String[] args) {
        Single1 s=new Single1();
        Single2 s1=new Single2();
        Single3 s2=new Single3();
        s.start();
        s1.start();
        s2.start();
    }
}

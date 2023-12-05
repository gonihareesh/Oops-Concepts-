package MultiThreading;
//Changing a Name of Thread...
public class MultiThreadDemo6 extends Thread
{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        MultiThreadDemo6 m6=new MultiThreadDemo6();
        MultiThreadDemo6 t1=new MultiThreadDemo6();


        System.out.println("Name of the thread: "+m6.getName());
        System.out.println("Name of the thread: "+t1.getName());
        t1.start();
        m6.start();
        m6.setName("Hari");
System.out.println("After changing name of Thread "+m6.getName());
        t1.setName("Harish");
        System.out.println("After changing name of Thread "+t1.getName());
    }
}

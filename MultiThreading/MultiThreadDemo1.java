package MultiThreading;

public class MultiThreadDemo1
{
    public static void main(String[] args) {
        Thread t=new Thread("This is first thread");
        t.start();
        String str=t.getName();
        System.out.println("Name of Thread: "+str);
        long num=t.getId();
        System.out.println("Id of the Thread: "+num);
        int pro=t.getPriority();
        System.out.println("Priority of Thread: "+pro);
    }
}

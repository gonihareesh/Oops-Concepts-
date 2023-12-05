package MultiThreading;
class Table{
    synchronized void printTable(int n){
for(int i=1;i<=5;i++){
    System.out.println(n*i);
    try {
        Thread.sleep(400);
    } catch (InterruptedException e) {
        System.out.println(e);
    }
}
    }
}
class MyThread extends Thread{
Table t;
MyThread(Table t){
    this.t=t;
}
public void run(){
    t.printTable(9);
}
}
class MyTable1 extends Thread{
    Table t;
    MyTable1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(12);
    }
}
public class SyncronizedMethod {
    public static void main(String[] args) {
        Table t=new Table();
        MyThread t1=new MyThread(t);
        MyTable1 t2=new MyTable1(t);
        t1.start();
        t2.start();
    }
}

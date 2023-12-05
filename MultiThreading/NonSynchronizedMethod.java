package MultiThreading;
//non Synchronized class
class Table1{
    public void printTable(int n){
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
class MyThread1 extends Thread{
    Table1 t;
    MyThread1(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(9);
    }
}
class MyTable extends Thread{
    Table1 t;
    MyTable(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(12);
    }
}
public class NonSynchronizedMethod {
    public static void main(String[] args) {
        Table1 t=new Table1();
        MyThread1 t1=new MyThread1(t);
        MyTable t2=new MyTable(t);
        t1.start();
        t2.start();
    }
}

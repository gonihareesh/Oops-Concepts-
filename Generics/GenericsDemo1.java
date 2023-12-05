package Generics;
class GenericTest1<T,U>
{
    private T id;
    private U name;
    public GenericTest1(T id, U name) {
        this.id = id;
        this.name = name;
    }
    public void print(){
        System.out.println("Generic id is: "+id);
        System.out.println("Generic name is: "+name);
    }
}
public class GenericsDemo1 {
    public static void main(String[] args) {
        GenericTest1<Integer,String> gt1=new GenericTest1<>(16,"harish");
        gt1.print();
    }
}

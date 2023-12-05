package Generics;

public class GenericsDemo
{
    public static void main(String[] args) {

            GenericTest<Integer> gen=new GenericTest<>(65);
            System.out.println("the Integer value is :"+gen.getdata());
            GenericTest<String> str=new GenericTest<>("Java is simple");
            System.out.println("The String name is: "+str.getdata());
    }
    }
class GenericTest<T>{
    private T data;
    public GenericTest(T data){
        this.data=data;
    }
    public T getdata(){
        return this.data;
    }
}
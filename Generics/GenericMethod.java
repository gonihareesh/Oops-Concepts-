package Generics;
public class GenericMethod{
    //Generic method T-> Type.
    public static <T> void display(T element){
        System.out.println(element.getClass().getName()+" "+element);
    }

    public static void main(String[] args) {
        display(65);
        display("Krishna");
        display(10.56);
        display(true);
        display('g');
    }
}


package FunctionalInterfaceandLambda;
//functional interface can contain multiple default,Static method in it but only one abstract method..
interface Note{
  abstract  void properties(int pages,String publisher);
    default void model(){
        System.out.println("it is belongs to history book");

    }
    static void price(int cost){
        System.out.println(cost);
    }
}
public class Book implements Note{
    @Override
    public void properties(int pages,String publisher){
System.out.println(pages+" "+publisher);

    }
    public static void main(String[] args) {
        Note n=(pages,publisher)->{
            System.out.println(pages+" "+publisher);
        };
        n.properties(225,"sirla Prabhupad");
        Book b=new Book();
        b.properties(300, "R.K.HariKrishna");
        b.properties(260,"S.chand");
        b.model();
        Note.price(456);
    }
}

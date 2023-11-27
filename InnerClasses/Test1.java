package InnerClasses;

public class Test1
{
    int id=101;
    public static void main(String[] args) {
        System.out.println("in main method : test class1");
    Test2 t= new Test1().new Test2();
    t.show();
    }
    //accessing a same variable in different classes
    public class Test2{
        int id=102;
        public void show(){
            int id=103;
            System.out.println(id);
            System.out.println("Inner class instance variable: "+this.id);
            System.out.println("Outer class instance variable: "+Test1.this.id);
        }
    }
}

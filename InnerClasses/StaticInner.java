package InnerClasses;
//
public class StaticInner
{
   static String data="InnerClasses";
   static class StaticDemo{
        public void info(){
            System.out.println("This is inner Class");
            System.out.println("accessing Outer class variable:"+data);
        }
    }
    public static void main(String[] args) {
        StaticInner.StaticDemo ss=new StaticInner.StaticDemo();
        ss.info();
    }
}

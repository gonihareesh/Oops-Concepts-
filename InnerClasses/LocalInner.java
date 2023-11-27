package InnerClasses;
//local Inner class are define inside the method.
public class LocalInner
{
    String data="Inside the method";
    public void display(){
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
           Local l=new Local();
            l.msg();

            }

    public static void main(String[] args) {
        LocalInner li=new LocalInner();
        li.display();
    }
        }



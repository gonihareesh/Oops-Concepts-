package OOps;

interface Mobile{
    abstract void oS();
    abstract void ram();
    abstract void rom();
}
class Redmi implements Mobile{
    public void oS(){
        System.out.println("redmi phone has shami os");
    }
    public void ram(){
        System.out.println("redmi phone has 8GB");
    }
    public void rom(){
        System.out.println("redmi phone has 125gb");
    }
}
class realme implements Mobile{

    @Override
    public void oS() {
        System.out.println("realme phone has android os");
    }
    @Override
    public void ram() {
        System.out.println("realme phone has 6gb");
    }
    @Override
    public void rom() {
        System.out.println("realme phone has 125gb");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Mobile m=new realme();
        m.oS();
        m.ram();
        m.rom();
        Mobile m1=new realme();
        m1.oS();
        m1.rom();
        m1.ram();

    }
}

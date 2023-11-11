public class Overriden {
    public void run() {
        System.out.println("run method");
    }

    public String name(String name) {
        return name = "krishna";
    }

}

class Rama extends Overriden {
    public void run() {
        System.out.println("main run method");
    }

    public void randam() {
        System.out.println("random method ");
    }
}

class Final {
    public static void main(String[] args) {
        Rama m = new Rama();
        Overriden o = new Overriden();
        m.run();
        m.randam();

        o.run();
        o.name(null);

    }
}
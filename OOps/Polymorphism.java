public class Polymorphism {
    void add(int x, int y) {
        System.out.println("result1:" + (x + y));

    }

    void add(int x, int y, int z) {
        System.out.println("result2:" + (x + y + z));
    }

    void add(double x, double y) {
        System.out.println("results:" + (x - y));
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.add(2, 3);
        p.add(3, 4, 5);
        p.add(5.7, 2.5);
    }
}

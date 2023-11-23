package Collections.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class CoolDrink {
    private String brand;
    private String taste;
    private int price;
    private int quantity;

    public CoolDrink(String brand, String taste, int price, int quantity) {
        this.brand = brand;
        this.taste = taste;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTaste() {
        return taste;
    }

    public void setTest(String taste) {
        this.taste = taste;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CoolDrink{" +
                "brand='" + brand + '\'' +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


}

public class TreeSetObject
{
    public static void main(String[] args) {
        //The Comparator defines the logic for comparing objects and determining their order.
    Set<CoolDrink> set=new TreeSet<CoolDrink>(Comparator.comparingDouble(CoolDrink::getPrice));
    set.add(new CoolDrink("Maaza","sweet",65,1));
        set.add(new CoolDrink("sprite","sweet",100,2));
        set.add(new CoolDrink("MountainDue","sweet",80,1));

        for (CoolDrink c:set
             ) {
            System.out.println(c);
        }


    }
}

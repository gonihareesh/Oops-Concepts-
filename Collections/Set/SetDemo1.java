package Collections.Set;

import java.util.HashSet;
import java.util.Set;
class Restaurant {
    private String name;
    private String address;
    private int pincode;
    private int phoneNumber;

    public Restaurant(String name, String address, int pincode, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Resturant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class SetDemo1
{
    public static void main(String[] args) {
        Set<Restaurant> set=new HashSet<>();
        set.add(new Restaurant("Oorinche ruchulu","Pragathi nagar",500072,227895));
        set.add(new Restaurant("Govinda resturant","Abdis",500012,212457));
        set.add(new Restaurant("panchakatu","JNTU",500075,224578));
        set.add(new Restaurant("Dawath resturant","Bodhan",503185,227877));
        for (Restaurant r:set) {
            System.out.println(r);
        }
    }
}

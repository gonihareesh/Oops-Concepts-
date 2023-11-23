package Collections.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2
{
    public static void main(String[] args) {
        List<Student> listOfStudents=new LinkedList<>();
        listOfStudents.add(new Student("sandeep",23,"Borabanda"));
        listOfStudents.add(new Student("Srikanth",25,"Ameerpet"));
        listOfStudents.add(new Student("ramana",12,"Laluguda"));
        listOfStudents.add(new Student("Suresh",11,"Malapur"));
        listOfStudents.add(new Student("Rahul",5,"Nagole"));

        System.out.println("List of Elements : ");
        for (Student s:listOfStudents
             ) {

            System.out.println(s);
        }

    }
}
class Student
{
private String name;
private int rollNumber;
private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int rollNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
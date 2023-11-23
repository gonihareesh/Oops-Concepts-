package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Teacher
{
    private String name;
    private double salary;
    private String subject;
    private String qualification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Teacher(String name, double salary, String subject, String qualification) {
        this.name = name;
        this.salary = salary;
        this.subject = subject;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", subject='" + subject + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
class ArrayListUserObject{
    public static void main(String[] args) {
        List<Teacher> list=new ArrayList<>();
        list.add(new Teacher("Tarun",15000,"Java","P.H.D"));
        list.add(new Teacher("Rathod",25000,"Phython","P.H.D"));
        System.out.println(list);
        list.forEach(lists ->{
                System.out.println("Name :"+lists.getName()+",salary: "+lists.getSalary()+",subject: "+lists.getSalary()+",qualification: "+lists.getQualification());

        });
    }
}

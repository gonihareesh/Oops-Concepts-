package InnerClasses;

import java.util.Scanner;

public class InnerClassDemo
{
    static int age;
    static class OuterClass{
        public void display(){
           if(age<18){
               System.out.println("person is not adult "+age);
           }else
               System.out.println("person age is adult "+age);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of person");
        age=s.nextInt();
        OuterClass oc=new OuterClass();
        oc.display();
    }
}

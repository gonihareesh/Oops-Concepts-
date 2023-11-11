package OOps;

public class SimpleCalculator
{
    private String firstName;
    private String secondName;

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0 && age<100){
            this.age=age;
        } else
            this.age=0;

    }
    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }
        else
            return false;
    }
 public String fullName(){
        if(firstName.isEmpty() && secondName.isEmpty()){
            return "";
        }else if(firstName.isEmpty()){
            return secondName;
        }else if(secondName.isEmpty()){
            return firstName;
        }else {
            return firstName+" "+secondName;
        }
 }

    public static void main(String[] args) {
        SimpleCalculator sc=new SimpleCalculator();
        sc.setFirstName("Gone");
        sc.setSecondName("");
        sc.setAge(29);
        sc.isTeen();
        System.out.println("Full name is "+sc.fullName());
        System.out.println("Is a teen or not "+sc.isTeen());
     //   System.out.println("firstName is "+sc.getFirstName());
       // System.out.println("Second name is "+sc.getSecondName());
        //System.out.println("Age is "+sc.getAge());

    }
}

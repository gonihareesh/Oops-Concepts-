public class EncapuslationDemo {

    private int rollNumber;
    private String name;
    private Boolean attendence;
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        System.out.println("rollnumber is:"+rollNumber);
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
         System.out.println("name is:"+name);
        this.name = name;
    }
    public Boolean getAttendence() {
        return attendence;
    }
    public void setAttendence(Boolean attendence) {
         System.out.println("attendence is:"+attendence);
        this.attendence = attendence;
    }
    
    
    public static void main(String[] args) {
        EncapuslationDemo ed=new EncapuslationDemo();
        ed.setRollNumber(21);
        ed.setName("roshan");
        ed.setAttendence(true);
    }
}

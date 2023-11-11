package OOps;

public class PojoClassDemo
{
    private int id;
    private String name;
    private String dateOfBirth;
    private String classLevel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public PojoClassDemo(int id, String name, String dateOfBirth, String classLevel) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classLevel = classLevel;
    }



    @Override
    public String toString() {
        return "PojoClassDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classLevel='" + classLevel + '\'' +
                '}';
    }
}

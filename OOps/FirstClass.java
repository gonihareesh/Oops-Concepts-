package OOps;

public class FirstClass
{
private String make="Tesla";
private String model="Model-t";
private int door=2;
private String colour="Green";

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make==null) make="Umknown";
        String lowerCaseMake=make.toLowerCase();
        switch (lowerCaseMake){
            case "holder","bmw","tesla","alto" -> this.make=make;
            default -> {
                this.make="unsupported";
            }
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void describeCar(){
        System.out.println(door+" door "+colour+"  "+model+"  "+ make+"  ");
    }
}

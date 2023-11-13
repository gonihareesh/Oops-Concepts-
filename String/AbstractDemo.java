package OOps;

public abstract class AbstractDemo
{
    protected String type;
    private String size;
     private double weight;

    public AbstractDemo(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public abstract void move(String speed);
    public abstract void makeNoice();

    public String getExplicitType(){
        return getClass().getSimpleName()+"("+type+")";
    }

}
class Dogs extends AbstractDemo{

    public Dogs(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed == "slow") {

            System.out.println(getExplicitType()+" walking "+speed);
        }else
            System.out.println(getExplicitType()+" Running "+speed);
    }

    @Override
    public void makeNoice() {
    if(type=="dog"){
        System.out.println(type+" sounds  bow bow");
    }else if(type=="wolf"){
        System.out.println(type+" sounds Howling!");
    }
    }
}
class Fish extends AbstractDemo{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {

            System.out.println(getExplicitType()+" Lazy Swimming "+speed);
        }else
            System.out.println(getExplicitType()+" darting frantically "+speed);
    }

    @Override
    public void makeNoice() {
        if(type=="GoldFish"){
            System.out.println(type+" Swish");
        }else {
            System.out.println(type+" splash");
        }
    }
}
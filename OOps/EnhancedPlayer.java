package OOps;

public class EnhancedPlayer
{
    private String fullName;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"Gun");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.fullName = name;
        if(health<=0){
            this.health=1;
        }else if(health>100){
            this.health = 100;
        }else {
            this.health=health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int demage){
        health=health-demage;
        if(health<=0){
            System.out.println("Player is knocked out of the game");
        }
    }
    public void restoreHealth(int extraHealth){
        health=health+extraHealth;
        if(health>100){
            System.out.println("player restored  100% is health");
        }
    }
    public int healthRemain(){
        return health;
    }

    public static void main(String[] args) {
        EnhancedPlayer ep=new EnhancedPlayer("Hari",200,"Sword");
        System.out.println("Name of the player is :"+ep.fullName);
        System.out.println("health of the player is :"+ep.health);
        System.out.println("weapon of the player is :"+ep.weapon);
        System.out.println("initial health is: "+ep.healthRemain());

    }
}

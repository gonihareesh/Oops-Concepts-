package OOps;
//with out encapsilation.......
public class Player
{
    public String name;
    public int health;
    public String weapon;
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
        Player p=new Player();
        p.name="hari";
        p.health=40;
        p.weapon="Gun";
        int demage=20;
        p.loseHealth(demage);
        System.out.println("Remaining health is: "+p.healthRemain());

        p.loseHealth(22);
        System.out.println("Remaining health is: "+p.healthRemain());
        int extraHealth=90;
        p.restoreHealth(extraHealth);
        System.out.println("Player health after extra health: "+p.healthRemain());
    }
}

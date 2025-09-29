import java.util.List;

public class Player implements ISavable{

    private  String name;
    private  String weapon;
    private  int hitPoints;
    private  int strength;

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Player(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="Sword";
    }


    @Override
    public List<String> write() {
        return List.of(this.name,this.weapon,String.valueOf(this.hitPoints),String.valueOf(this.strength));
    }

    @Override
    public void read(List<String> list) {
        if(list!=null && !list.isEmpty()){
            this.name=list.get(0);
            this.weapon=list.get(1);
            this.hitPoints=Integer.parseInt(list.get(2));
            this.strength=Integer.parseInt(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}

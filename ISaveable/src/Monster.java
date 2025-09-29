import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;

    // Constructor
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getters
    public String getName() { return name; }
    public int getHitPoints() { return hitPoints; }
    public int getStrength() { return strength; }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add(String.valueOf(this.hitPoints));
        values.add(String.valueOf(this.strength));
        return values;
    }

    @Override
    public void read(List<String> saved) {
        if (saved != null && !saved.isEmpty()) {
            this.name = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
        }
    }

    // toString
    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + "}";
    }
}

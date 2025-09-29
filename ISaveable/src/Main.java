import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim);

        List<String> savedPlayer = tim.write();
        Player newPlayer = new Player("Default", 0, 0);
        newPlayer.read(savedPlayer);
        System.out.println(newPlayer);

        Monster werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
    }
}

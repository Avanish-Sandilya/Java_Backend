public class Main {
    public record FootballPlayer(String name) implements Player{};
    public static void main(String[] args) {
        Team<FootballPlayer> barcelona = new Team<>("Barcelona");
        Team<FootballPlayer> madrid = new Team<>("Real Madrid");

        barcelona.addPlayer(new FootballPlayer("Messi"));
        madrid.addPlayer(new FootballPlayer("Ronaldo"));

        barcelona.matchResult(madrid, 3, 2);

        System.out.println(barcelona.getName() + " ranking: " + barcelona.getWon());
        System.out.println(madrid.getName() + " ranking: " + madrid.getWon());
    }
}

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

    private final String name;
    private final List<T> players=new ArrayList<>();
    private int won;
    private int lost;

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(T t){
        if(!players.contains(t)){
            players.add(t);
        }
    }

    public int numPlayers(){
        return players.size();
    }

    public String getName() {
        return name;
    }

    public List<T> getPlayers() {
        return players;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public String matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore>theirScore){
            this.won++;
            opponent.setLost(opponent.getLost()+1);
            return this.name+ "won";
        } else if (ourScore<theirScore) {
            this.lost++;
            opponent.setWon(opponent.getWon()+1);
            return this.name+ "lost";
        }

        return "match drawn";
    }



}

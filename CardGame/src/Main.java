import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static ArrayList<String> deckSupplier(){
        ArrayList<String> deck = new ArrayList<>();

        String [] type = {"Diamonds","Spades","Clubs","Hearts"};
        String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for(var v :type){
            for(var w:value){
                deck.add(v +" of "+ w);
            }
        }

        Collections.shuffle(deck);

        return deck;

    }

    public static ArrayList<ArrayList<String>> handSupplier(ArrayList<String> shuffledDeck, int numberOfPlayers){
        if(numberOfPlayers>17){
            var sol=new ArrayList<ArrayList<String>>();
            sol.add(new ArrayList<>(List.of("Max 17 players allowed")));
            return sol;
        }
        var sol=new ArrayList<ArrayList<String>>();
        for (int i=0;i<numberOfPlayers;i++){
            var hand = new ArrayList<String>();
            for(int j=0;j<3;j++){
                String card = shuffledDeck.remove(shuffledDeck.size()-1);
                hand.add(card);
            }
            sol.add(hand);
        }
        return sol;
    }

}

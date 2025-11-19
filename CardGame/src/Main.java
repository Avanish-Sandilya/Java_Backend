import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }

    public static ArrayList<String> deckSupplier(){
        ArrayList<String> deck = new ArrayList<>();

        String [] type = {"Diamonds","Spades","Clubs","Hearts"};
        String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for(var v :type){
            for(var w:value){
                deck.add(Arrays.toString(type) +" of "+ Arrays.toString(value));
            }
        }

        Collections.shuffle(deck);

        return deck;


    }

}

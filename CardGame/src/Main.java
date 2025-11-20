import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numberOfPlayers = input.nextInt();
        var hands = handSupplier(deckSupplier(),numberOfPlayers);
        HashMap<Integer,ArrayList<String>> playerHands=new HashMap<>();

        if(hands.get(0).get(0).equals("Max 17 players allowed")) {
            System.out.println("More than 17 players are not allowed");
        }else{
            for(int i=0;i<numberOfPlayers;i++){
                playerHands.put(i,hands.get(i));
            }

            playerHands.forEach((player,hand)-> System.out.println("Player "+player+"'s hand: "+hand));

        }

    }

    public static ArrayList<String> deckSupplier(){
        ArrayList<String> deck = new ArrayList<>();

        String [] type = {"Diamonds","Spades","Clubs","Hearts"};
        String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for(var v :type){
            for(var w:value){
                deck.add(w +" of "+ v);
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

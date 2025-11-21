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

            playerHands.forEach((player,hand)-> System.out.println("Player "+(player+1)+"'s hand: "+hand));

            int winner = returnWinner(playerHands);
            if(winner==-1){
                System.out.println("There is a tie between two players, They both will have to play again to decide the winner");

            }else{
                System.out.println("Player "+(winner+1)+" wins the hand");
            }

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

    public static int returnWinner(HashMap<Integer,ArrayList<String>> playerHands){
        int winner = -1;
        ArrayList<String> bestHand = null;
        boolean tie = false;

        for (var entry : playerHands.entrySet()) {
            int player = entry.getKey();
            ArrayList<String> hand = entry.getValue();

            if (bestHand == null) {
                bestHand = hand;
                winner = player;
            } else {
                int cmp = compareHands(hand, bestHand);
                if (cmp > 0) {
                    bestHand = hand;
                    winner = player;
                    tie = false;         // reset tie flag
                } else if (cmp == 0) {
                    tie = true;          // matching best hand
                }
            }
        }

        return tie ? -1 : winner;   // return -1 for tie
    }


    public static int handRank(ArrayList<String> hand) {
        if (isTrail(hand)) return 6;
        if (isPureSequence(hand)) return 5;
        if (isSequence(hand)) return 4;
        if (isColor(hand)) return 3;
        if (isPair(hand)) return 2;
        return 1;
    }

    public static int cardValue(String card) {
        String value = card.split(" ")[0];
        return switch (value) {
            case "Ace" -> 14;
            case "King" -> 13;
            case "Queen" -> 12;
            case "Jack" -> 11;
            default -> Integer.parseInt(value);
        };
    }

    public static String suitOf(String card) {
        return card.split(" ")[2];
    }

    public static boolean isTrail(ArrayList<String> h) {
        return cardValue(h.get(0)) == cardValue(h.get(1)) &&
                cardValue(h.get(1)) == cardValue(h.get(2));
    }

    public static boolean isColor(ArrayList<String> h) {
        return suitOf(h.get(0)).equals(suitOf(h.get(1))) &&
                suitOf(h.get(1)).equals(suitOf(h.get(2)));
    }

    public static boolean isSequence(ArrayList<String> h) {
        ArrayList<Integer> v = new ArrayList<>();
        for (var c : h) v.add(cardValue(c));
        Collections.sort(v);

        if (v.get(0) + 1 == v.get(1) && v.get(1) + 1 == v.get(2)) return true;

        return v.get(0) == 2 && v.get(1) == 3 && v.get(2) == 14;
    }

    public static boolean isPureSequence(ArrayList<String> h) {
        return isColor(h) && isSequence(h);
    }

    public static boolean isPair(ArrayList<String> h) {
        int a = cardValue(h.get(0));
        int b = cardValue(h.get(1));
        int c = cardValue(h.get(2));
        return a == b || b == c || a == c;
    }

    public static int compareHands(ArrayList<String> h1, ArrayList<String> h2) {
        int r1 = handRank(h1);
        int r2 = handRank(h2);

        if (r1 != r2) return r1 - r2;

        // Same rank, break tie
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        for (var c : h1) v1.add(cardValue(c));
        for (var c : h2) v2.add(cardValue(c));
        Collections.sort(v1);
        Collections.sort(v2);

        for (int i = 2; i >= 0; i--) {
            if (!v1.get(i).equals(v2.get(i))) {
                return v1.get(i) - v2.get(i);
            }
        }
        return 0;
    }


}

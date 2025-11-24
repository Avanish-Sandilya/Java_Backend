import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numberOfPlayers = input.nextInt();

        // Generate deck and distribute cards to players
        var hands = handSupplier(deckSupplier(), numberOfPlayers);
        HashMap<Integer, ArrayList<String>> playerHands = new HashMap<>();

        // Check for invalid number of players
        if (hands.get(0).get(0).equals("Max 17 players allowed")) {
            System.out.println("More than 17 players are not allowed");
        } else if(hands.get(0).get(0).equals("Min 2 players are needed")){
            System.out.println("Min 2 players are needed to play the game");
        }else{

            // Map each player to their respective hand
            for (int i = 0; i < numberOfPlayers; i++) {
                playerHands.put(i, hands.get(i));
            }

            // Print hands for each player
            playerHands.forEach((player, hand) ->
                    System.out.println("Player " + (player + 1) + "'s hand: " + hand));

            // Determine the winner
            int winner = returnWinner(playerHands);

            if (winner == -1) {
                System.out.println("There is a tie between two players, They both will have to play again to decide the winner");
            } else {
                System.out.println("Player " + (winner + 1) + " wins the hand");
            }
        }
    }

    // Creates a standard deck of 52 cards and shuffles it
    public static ArrayList<String> deckSupplier() {
        ArrayList<String> deck = new ArrayList<>();

        String[] type = {"Diamonds", "Spades", "Clubs", "Hearts"};
        String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Build deck as "Value of Suit"
        for (var v : type) {
            for (var w : value) {
                deck.add(w + " of " + v);
            }
        }

        // Shuffle deck randomly
        Collections.shuffle(deck);

        return deck;
    }

    // Distributes 3 cards per player and handles condition where >17 players are not allowed
    public static ArrayList<ArrayList<String>> handSupplier(ArrayList<String> shuffledDeck, int numberOfPlayers) {

        // Game rule constraint: 17 players max (17*3 = 51 cards)
        if (numberOfPlayers > 17) {
            var sol = new ArrayList<ArrayList<String>>();
            sol.add(new ArrayList<>(List.of("Max 17 players allowed")));
            return sol;
        }

        if(numberOfPlayers<2){
            var sol = new ArrayList<ArrayList<String>>();
            sol.add(new ArrayList<>(List.of("Min 2 players are needed")));
            return sol;
        }

        var sol = new ArrayList<ArrayList<String>>();

        // For each player, remove 3 cards from the deck (from the end)
        for (int i = 0; i < numberOfPlayers; i++) {
            var hand = new ArrayList<String>();
            for (int j = 0; j < 3; j++) {
                String card = shuffledDeck.remove(shuffledDeck.size() - 1);
                hand.add(card);
            }
            sol.add(hand);
        }
        return sol;
    }

    // Determines the winning player by comparing hands
    public static int returnWinner(HashMap<Integer, ArrayList<String>> playerHands) {
        int winner = -1;
        ArrayList<String> bestHand = null;
        boolean tie = false;

        // Iterate over each player's hand
        for (var entry : playerHands.entrySet()) {
            int player = entry.getKey();
            ArrayList<String> hand = entry.getValue();

            // First player automatically becomes the best initially
            if (bestHand == null) {
                bestHand = hand;
                winner = player;
            } else {
                int cmp = compareHands(hand, bestHand);

                // If current hand outranks bestHand
                if (cmp > 0) {
                    bestHand = hand;
                    winner = player;
                    tie = false; // reset tie flag
                }
                // If hands have same ranking and same strength
                else if (cmp == 0) {
                    tie = true;
                }
            }
        }

        // Return -1 when a tie exists
        return tie ? -1 : winner;
    }

    // Determines ranking of a hand based on Teen Patti rules
    public static int handRank(ArrayList<String> hand) {
        if (isTrail(hand)) return 6;          // Three of a kind
        if (isPureSequence(hand)) return 5;  // Straight flush
        if (isSequence(hand)) return 4;      // Straight
        if (isColor(hand)) return 3;         // Flush
        if (isPair(hand)) return 2;          // Pair
        return 1;                            // High card
    }

    // Converts card face value to numerical value for comparison
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

    // Returns suit of the card
    public static String suitOf(String card) {
        return card.split(" ")[2];
    }

    // Check for Trail (Three of a kind)
    public static boolean isTrail(ArrayList<String> h) {
        return cardValue(h.get(0)) == cardValue(h.get(1)) &&
                cardValue(h.get(1)) == cardValue(h.get(2));
    }

    // Check for Color (Flush)
    public static boolean isColor(ArrayList<String> h) {
        return suitOf(h.get(0)).equals(suitOf(h.get(1))) &&
                suitOf(h.get(1)).equals(suitOf(h.get(2)));
    }

    // Check for Straight (Sequence)
    public static boolean isSequence(ArrayList<String> h) {
        ArrayList<Integer> v = new ArrayList<>();
        for (var c : h) v.add(cardValue(c));
        Collections.sort(v);

        // Normal straight
        if (v.get(0) + 1 == v.get(1) && v.get(1) + 1 == v.get(2)) return true;

        // Special straight: A 2 3
        return v.get(0) == 2 && v.get(1) == 3 && v.get(2) == 14;
    }

    // Pure sequence = straight + flush
    public static boolean isPureSequence(ArrayList<String> h) {
        return isColor(h) && isSequence(h);
    }

    // Check for Pair
    public static boolean isPair(ArrayList<String> h) {
        int a = cardValue(h.get(0));
        int b = cardValue(h.get(1));
        int c = cardValue(h.get(2));
        return a == b || b == c || a == c;
    }

    // Compare two hands by rank and then by card values
    public static int compareHands(ArrayList<String> h1, ArrayList<String> h2) {
        int r1 = handRank(h1);
        int r2 = handRank(h2);

        // Higher rank wins
        if (r1 != r2) return r1 - r2;

        // If ranks match, compare sorted card values
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();

        for (var c : h1) v1.add(cardValue(c));
        for (var c : h2) v2.add(cardValue(c));

        Collections.sort(v1);
        Collections.sort(v2);

        // Compare highest to lowest
        for (int i = 2; i >= 0; i--) {
            if (!v1.get(i).equals(v2.get(i))) {
                return v1.get(i) - v2.get(i);
            }
        }

        return 0; // hands are exactly equal
    }
}

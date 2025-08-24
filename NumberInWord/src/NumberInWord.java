public class NumberInWord {

    public static String numberInWord(int number){
        String result="";
        switch (number){
            case 1->result="ONE";
            case 2->result="TWO";
            case 3->result="THREE";
            case 4->result="FOUR";
            case 5->result="FIVE";
            case 6->result="SIX";
            case 7->result="SEVEN";
            case 8->result="EIGHT";
            case 9->result="NINE";
            case 0->result="ZERO";
            default->result="Invalid input";
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(numberInWord(5));
        System.out.println(numberInWord(2));
    }
}

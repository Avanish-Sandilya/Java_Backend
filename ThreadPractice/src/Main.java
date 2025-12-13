public class Main {
    public static void main(String[] args) {
        OddValues odd = new OddValues();

        EvenValues e = new EvenValues();
        Thread even = new Thread(e);

        odd.start();
        even.start();
    }
}

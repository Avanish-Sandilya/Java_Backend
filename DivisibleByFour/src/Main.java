public class Main {
    public static void main(String[] args) {
        System.out.println(isDivisibleByFour("345345344"));
    }

    private static int isDivisibleByFour(String N){
        if (N.length() < 2) {
            return (Integer.parseInt(N) % 4 == 0) ? 1 : 0;
        }

        int lastTwoDigits = Integer.parseInt(N.substring(N.length() - 2));
        return (lastTwoDigits % 4 == 0) ? 1 : 0;
    }
}

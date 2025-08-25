public class FirstAndLastSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String num = String.valueOf(number);

        int firstDigit = Character.getNumericValue(num.charAt(0));
        int lastDigit = Character.getNumericValue(num.charAt(num.length() - 1));

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(-257));
    }
}

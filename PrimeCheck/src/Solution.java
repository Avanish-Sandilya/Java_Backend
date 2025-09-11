class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0, 1, negatives not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // eliminate evens early

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(597));
    }
}
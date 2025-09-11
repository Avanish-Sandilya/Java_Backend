class Solution {
    public static boolean isPowerOfAnother(int x, int y) {
        if (x <= 1) {
            return y == 1;  // Only case where it works
        }
        if (y == 1) {
            return true;    // x^0 = 1
        }

        for (int i = 0; ; i++) {
            double power = Math.pow(x, i);

            if (power > y) {
                break;
            }

            if ((int) power == y) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfAnother(2,8));
    }
}

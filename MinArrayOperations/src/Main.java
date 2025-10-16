import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 19, 16};
        int k = 3;
        System.out.println(minOps(arr, k));
    }
    static int minOps(int arr[], int k) {

        if (k == 0) return -1;

        int max = Arrays.stream(arr).max().getAsInt();
        int ops = 0;

        for (int num : arr) {
            if ((max - num) % k != 0) {
                return -1;
            }
            ops += (max - num) / k;
        }

        return ops;
    }
}

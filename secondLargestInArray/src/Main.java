public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (var v : arr) {
            if (v > largest) {
                secondLargest = largest;
                largest = v;
            } else if (v > secondLargest && v != largest) {
                secondLargest = v;
            }
        }

        System.out.println(secondLargest);
    }
}
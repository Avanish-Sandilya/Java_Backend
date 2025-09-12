// User function Template for Java
class Solution {
    public static boolean checkValidity(int a, int b, int c) {
        // code here
        return a + b > c && (a + c > b && (b + c >= a));
    }

    public static void main(String[] args) {
        System.out.println(checkValidity(5, 4, 7));
    }
}
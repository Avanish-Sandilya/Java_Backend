public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(555));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(24));

    }

    private static boolean isPalindrome(int n){
        String num=String.valueOf(n);
        int start = 0;
        int end = num.length()-1;

        while(start<end){
            if(num.charAt(start)!=num.charAt(end)){
                return false;

            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}

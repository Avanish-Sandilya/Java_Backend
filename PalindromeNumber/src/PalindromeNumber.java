public class PalindromeNumber {

    public static boolean isPalindrome(int number){
        String num;
        if(number<0){
            num=String.valueOf(number*-1);
        }else {
            num = String.valueOf(number);
        }

        int start = 0;
        int end = num.length()-1;

        while(start<end){
            if(num.charAt(start)!=num.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-99));
        System.out.println(isPalindrome(112211));
    }
}

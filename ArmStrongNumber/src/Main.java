public class Main {
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));
        System.out.println(isArmStrongNumber(253));
    }

    private static boolean isArmStrongNumber(int n){
        char[] str= String.valueOf(n).toCharArray();
        int sum=0;
        for(var v:str){
            sum+= (int) Math.pow(Character.getNumericValue(v),3);
        }
        return sum==n;
    }
}

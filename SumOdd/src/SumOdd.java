public class SumOdd {

    public static boolean isOdd(int number){
        return number%2!=0;
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1,10));
    }
}

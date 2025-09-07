import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arr = getArray(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int start =0;
        int end = arr.length-1;

        while(start<end){
            int temp=0;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));


    }

    public static int[] getArray(int size){
        int[] arr = new int[size];
        Random random = new Random();

        for(int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(100);
        }

        return arr;
    }
}

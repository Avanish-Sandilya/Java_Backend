import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr){
        ArrayList<Integer> tempList = new ArrayList<>();
        for(var v:arr){
            tempList.add(v);
        }
        Collections.reverse(tempList);
        for(int i=0;i<arr.length;i++){
            arr[i]=tempList.get(i);
        }
    }
}

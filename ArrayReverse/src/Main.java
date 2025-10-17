import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

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

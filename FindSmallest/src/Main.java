import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //raw
        int[] arr = getArray();
        System.out.println(Arrays.toString(arr));
        int min=Integer.MAX_VALUE;

        for(var v:arr){
            if(v<min)min=v;
        }
        System.out.println(min);

    }
    private static int[] getArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list of numbers separated by comma");
        String userInput=input.nextLine();
        String[] arr = userInput.trim().split(",");
        int[] integerArr = new int[arr.length];
        for(int i=0;i<integerArr.length;i++){
            integerArr[i]=Integer.parseInt(arr[i]);
        }
        return integerArr;
    }
}

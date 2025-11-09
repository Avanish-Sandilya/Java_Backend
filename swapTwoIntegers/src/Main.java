import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers separated by comma");
        String useInput = input.nextLine();
        String cleanedInput = useInput.trim();
        int[] arr = new int[2];
        arr[0]=Integer.parseInt(cleanedInput.substring(0,cleanedInput.indexOf(',')));
        arr[1]=Integer.parseInt(cleanedInput.substring(cleanedInput.indexOf(',')+1));
        swap(arr);
        System.out.println("a: "+arr[0]+", b: "+arr[1]);
    }

    public static void swap(int[] a){

        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;

    }
}

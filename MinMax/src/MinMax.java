import java.util.Scanner;

public class MinMax {

    public static boolean isValid(String value){
        try{
            Integer.parseInt(value);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing){
            System.out.println("Enter a number to continue or any other key to quit");
            String userInput = input.nextLine();
            if(isValid(userInput)){
                if(Integer.parseInt(userInput)<min){
                    min=Integer.parseInt(userInput);
                }
                if(Integer.parseInt(userInput)>max){
                    max=Integer.parseInt(userInput);
                }
            }else{
                keepGoing=false;
            }
        }

        input.close();
        System.out.printf("Min value: %s and Max value: %s",min,max);
    }
}

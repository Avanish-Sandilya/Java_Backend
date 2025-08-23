import java.text.DecimalFormat;
import java.util.Scanner;

public class SpeedConverter {

    public static double milesToKm(double miles){
        //to limit output to 4 decimal points
        DecimalFormat df = new DecimalFormat("#.####");
        double oneMileInKm=1.60934;
        double solution= miles * oneMileInKm;
        return Double.parseDouble(df.format(solution));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in Miles");


        //validating user input
        if(input.hasNextDouble()){
            //getting user input
            double valueInMiles=input.nextDouble();
            System.out.println(milesToKm(valueInMiles));

        }else{
            System.out.println("Invalid input");
        }

    }
}

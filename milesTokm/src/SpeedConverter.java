import java.text.DecimalFormat;
import java.util.Scanner;

public class SpeedConverter {

    public static double milesToKm(double miles){
        DecimalFormat df = new DecimalFormat("#.####");
        double oneMileInKm=1.60934;
        double solution= miles * oneMileInKm;
        return Double.parseDouble(df.format(solution));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in Miles");
        double valueInMiles=input.nextDouble();
        System.out.println(milesToKm(valueInMiles));
    }
}

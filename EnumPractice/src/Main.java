import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of week to know the parking charges");
        System.out.println("1-MON, 2-TUE, 3-WED, 4-THUR, 5-FRI, 6-SAT, 7-SUN");
        String userInput = input.nextLine();
        System.out.println("Rs: " + getParkingCharge(userInput.toUpperCase()) + " per minute");

    }

    public static double getParkingCharge(String day) {
        try {
            DaysOfWeek dayEnum = DaysOfWeek.valueOf(day);
            return dayEnum.getPrice();
        } catch (Exception e) {
            System.out.println(e + "\nInvalid input");
            return 0;
        }

    }
}

import java.util.Scanner;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,6));
        System.out.println(shouldWakeUp(true,13));
    }
}

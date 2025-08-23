import java.util.Scanner;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 0 && hourOfDay <= 24)
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 6));
        System.out.println(shouldWakeUp(true, 13));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean running = true;
        while (running) {
            menu();
            int userInput = input.nextInt();
            input.nextLine(); // consume newline after number
            running = listOperation(userInput, groceryList, input);
            System.out.println("Current List: " + groceryList);
        }
        input.close();
    }

    private static void menu() {
        System.out.println("""
                0. Enter 0 to shut down
                1. Enter 1 to add item (comma delimited list)
                2. Enter 2 to remove item (comma delimited list)
                Enter your choice:
                """);
    }

    private static boolean listOperation(int value, ArrayList<String> arr, Scanner input) {
        switch (value) {
            case 0 -> {
                arr.clear();
                System.out.println("Shutting down. List cleared.");
                return false; // end program
            }
            case 1 -> {
                System.out.println("Enter items separated by comma:");
                String userInput = input.nextLine();
                Arrays.stream(userInput.split(","))
                        .map(String::trim)
                        .forEach(arr::add);
            }
            case 2 -> {
                System.out.println("Enter items separated by comma:");
                String userInput = input.nextLine();
                Arrays.stream(userInput.split(","))
                        .map(String::trim)
                        .forEach(arr::remove);
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
        return true; // continue running
    }
}

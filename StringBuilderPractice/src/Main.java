import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String userInput= input.nextLine();
        StringBuilder s = new StringBuilder(userInput);
        System.out.println(s.reverse().toString());
    }
}

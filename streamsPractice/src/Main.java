import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 5, 7, 2, 10, 3, 12, 19);

        List<Integer> squaredEvens = numList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        squaredEvens.forEach(System.out::println);

        System.out.println("============================================");

        List<String> nameList = List.of("Arjun", "Amit", "Sanya", "Ankita", "Ravi");
        List<String> nameStartsWithA=nameList.stream().filter(name->name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        nameStartsWithA.forEach(System.out::println);

    }
}

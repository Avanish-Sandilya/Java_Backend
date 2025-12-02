import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.println("=============================================");

        List<Integer> numList2=List.of(11, 22, 33, 44, 55);
        int sumOfOdds=numList2.stream().filter(num->num%2==1).reduce(0, Integer::sum);
        System.out.println(sumOfOdds);

        System.out.println("===============================================");

        String line = "java streams make java code cleaner and java developers happier";
        int javaCount = (int)Arrays.stream(line.split(" ")).filter(word->word.equalsIgnoreCase("java")).count();
        System.out.println(javaCount);

    }
}

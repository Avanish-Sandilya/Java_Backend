import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("===============================================");
        List<Product> products = List.of(
                new Product("Mechanical Keyboard", 4999.0, 5),
                new Product("Noise Cancelling Headphones", 14999.0, 4),
                new Product("USB-C Hub", 1999.0, 3),
                new Product("4K Monitor", 24999.0, 5),
                new Product("Ergonomic Chair", 12000.0, 4),
                new Product("Laptop Stand", 899.0, 4),
                new Product("Wireless Mouse", 1299.0, 3)
        );

        Product mostExpensive=products.stream().max(Comparator.comparingDouble(p->p.price)).orElse(null);
        System.out.println(mostExpensive);

        Product highestRated=products.stream().max(Comparator.comparingInt(p->p.rating)).orElse(null);
        System.out.println(highestRated);

        Product mostValue = products.stream().max(Comparator.comparingDouble(p->p.rating/p.price)).orElse(null);
        System.out.println(mostValue);

    }
}

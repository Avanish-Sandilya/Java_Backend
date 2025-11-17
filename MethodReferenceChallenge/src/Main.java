import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Amit","Rajesh","Mili","Shivam","Kriti"));

        names.forEach(System.out::println);
        System.out.println("=======================");
        UnaryOperator<String> adding = "Hello "::concat;
        names.replaceAll(adding);
        System.out.println(names);

    }
}

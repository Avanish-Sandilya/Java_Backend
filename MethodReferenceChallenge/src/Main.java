import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Amit","Rajesh","Mili","Shivam","Kriti"));

        names.forEach(System.out::println);
        System.out.println("=======================");
        UnaryOperator<String> adding = "Hello "::concat;
        names.replaceAll(adding);
        System.out.println(names);
        System.out.println("========================");
        names.replaceAll(name->name.substring(name.indexOf(" ")+1));
        names.forEach(System.out::println);
        System.out.println("=========================");
        ArrayList<String> lastNames = new ArrayList<>(List.of("Singh","Sharma","Sahu","Kushwaha"));
        Supplier<Integer> nameSupplier = ()->new Random().nextInt(0, lastNames.size());
        names.replaceAll(name->name+" "+lastNames.get(nameSupplier.get()));
        System.out.println(names);
        System.out.println("===========================");
        Function<String,String> nameReverse = (name->new StringBuilder(name).reverse().toString());
        names.replaceAll(name->name.concat(" ").concat(nameReverse.apply(name.substring(0,name.indexOf(" ")))));
        names.forEach(System.out::println);
        System.out.println("============================");
        names.replaceAll(String::toUpperCase);
        System.out.println(names);

    }
}

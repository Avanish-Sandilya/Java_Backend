import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        var lengthBreadth = Arrays.asList(new int[]{5, 7}, new int[]{9, 12}, new int[]{3, 4});
        lengthBreadth.forEach(s -> System.out.println(Arrays.toString(s)));
        BiConsumer<Integer, Integer> p1 = (l, b) -> System.out.printf("[length:%d breadth:%d]", l, b);
        var firstValue = lengthBreadth.get(0);
        process(firstValue[0], firstValue[1], p1);
        System.out.println("=============================");
        lengthBreadth.forEach(s -> process(s[0], s[1], p1));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        ArrayList<String> nato = new ArrayList<>(List.of("Alpha", "Bravo", "Charlie", "Delta", "Echo"));
        nato.removeIf(s -> s.startsWith("De"));
        System.out.println(nato);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        BiConsumer<Integer, Integer> p2 = (val1, val2) -> System.out.println(val1 + " to the power " + val2 + " is: " + (int)Math.pow(val1, val2));
        process(2, 4, p2);
    }


    public static <T> void process(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }
}

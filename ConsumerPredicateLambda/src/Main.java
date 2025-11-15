import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var lengthBreadth = Arrays.asList(new int[]{5,7},new int[]{9,12},new int[]{3,4});
        lengthBreadth.forEach(s-> System.out.println(Arrays.toString(s)));
    }
}

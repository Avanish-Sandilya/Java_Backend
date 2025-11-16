import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nato = new ArrayList<>(List.of("Alpha","Bravo","Charlie","Delta","Echo"));
        nato.replaceAll(s->String.valueOf(s.charAt(0)).toLowerCase()+" - "+s.toUpperCase());
        nato.forEach(System.out::println);

        System.out.println("==================================");

        Supplier<Integer> randomNumberSupplier=()->new Random().nextInt(0, nato.size());
        String[] randomList = randomlySelectedValues(10,nato,randomNumberSupplier);
        System.out.println(Arrays.toString(randomList));
    }

    public static String[] randomlySelectedValues(int count, ArrayList<String> values, Supplier<Integer> s){
        String[] selectedValues=new String[count];
        for(int i=0;i<count;i++){
            selectedValues[i]=values.get(s.get());
        }
        return selectedValues;
    }
}

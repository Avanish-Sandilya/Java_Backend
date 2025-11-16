import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        String line="Its nice and sunny outside";

        Consumer<String> printParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                Arrays.asList(parts).forEach(System.out::println);
            }
        };

        printParts.accept(line);

        System.out.println("============================================");

        Consumer<String> printConcise=s->Arrays.asList(s.split(" ")).forEach(System.out::println);
        printConcise.accept(line);

        System.out.println("====================================================");

        UnaryOperator<String> everySecondCharacter=source->{
            StringBuilder returnVal= new StringBuilder();
            for(int i=0;i<source.length();i++){
                if(i%2==1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharacter.apply(line));

    }


}

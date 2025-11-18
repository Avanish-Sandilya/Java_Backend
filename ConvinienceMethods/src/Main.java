import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String name = "Ricky";
        Function<String,String> surName=s->s.concat(" Ponting");
        Function<String,String> nameToUpper=String::toUpperCase;
        //Function<String,String> fullName = nameToUpper.andThen(surName);
        Function<String,String> fullName = nameToUpper.compose(surName);
        System.out.println(fullName.apply(name));
    }
}

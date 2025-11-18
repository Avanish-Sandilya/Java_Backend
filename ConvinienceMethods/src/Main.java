import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String name = "Ricky";
        Function<String,String> surName=s->s.concat(" Ponting");
        Function<String,String> nameToUpper=String::toUpperCase;
        //Function<String,String> fullName = nameToUpper.andThen(surName);
        Function<String,String> fullName = nameToUpper.compose(surName);
        System.out.println(fullName.apply(name));

        System.out.println("=============================================");

        record person(String firstName,String lastName){}

        ArrayList<person> people = new ArrayList<>(
                List.of(
                        new person("Mahendra","Dhoni"),
                        new person("Ricky","Ponting"),
                        new person("Virat","Kohli"),
                        new person("Pat","Cummins"),
                        new person("Ricky","Rutherford")

                )
        );

        people.sort(Comparator.comparing(person::firstName).thenComparing(person::lastName));
        people.forEach(System.out::println);



    }
}

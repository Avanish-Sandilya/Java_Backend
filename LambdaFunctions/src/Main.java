import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName){
        @Override
        public String toString(){
            return firstName+" "+lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Ram","Prasad"),
                new Person("Rajendra","Prasad"),
                new Person("Vallabh","Patel"),
                new Person("Ramprasad","Bismil")
        ));

        var comparePeople = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

        people.sort(comparePeople);
        System.out.println(people);

        people.sort(((o1, o2) -> o1.firstName.compareTo(o2.firstName)));
        System.out.println(people);

        people.sort((Comparator.comparing(p ->p.firstName)));
        System.out.println(people);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        people.forEach(System.out::println);

    }
}

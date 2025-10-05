import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aman", 85));
        students.add(new Student("Vikram", 95));
        students.add(new Student("Rohit", 75));

        Collections.sort(students);
        System.out.println(students);

        students.sort((s1, s2) -> s2.getMarks() - s1.getMarks());
        System.out.println(students);
    }

}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of("C:/Users/91834/Desktop/test.txt"));
        System.out.println(text);
        System.out.println("==========================");

        //Files.writeString(Path.of("C:/Users/91834/Desktop/test.txt"),text+" added to the file");
        //System.out.println("===========================");

//        Files.copy(Path.of("a.txt"), Path.of("b.txt"));
//        Files.move(Path.of("old.txt"), Path.of("new.txt"));
//        Files.delete(Path.of("trash.txt"));

        List<String> list = Files.readAllLines(Path.of("C:/Users/91834/Desktop/test.txt"));
        List<String> upper = list.stream().map(String::toUpperCase).toList();

        System.out.println(upper);





    }
}

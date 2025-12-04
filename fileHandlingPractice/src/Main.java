import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of("C:/Users/91834/Desktop/test.txt"));
        System.out.println(text);

    }
}

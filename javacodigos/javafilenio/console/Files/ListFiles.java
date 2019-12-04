import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;
class ListFiles {
public static void main(String []args) throws IOException {
Files.list(Paths.get("."))
.map(path -> path.toAbsolutePath()) 
.forEach(System.out::println);
}
}

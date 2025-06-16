import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvParser {
   public List<String>parse (String filePath) throws IOException {
       return Files.readAllLines(Path.of(filePath));
   }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> cities = Files.readAllLines(Path.of("D:\\programming\\Projects\\cities-and-temperatures\\temperatures.csv"));
        System.out.println(cities);
        for (String city:cities) {
            var citiesAndTemperature = city.split(";");
        }
    }
}
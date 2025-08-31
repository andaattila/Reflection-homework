import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<Integer> generatedNumbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(1, 91);
            generatedNumbers.add(randomNumber);
        }

        List<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Please enter your number");
            int userNumber= scanner.nextInt();
            userNumbers.add(userNumber);
        }



    }
}

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        long number = 1;
        for (int i = 1; i <= userInput; i++) {
            number *= i;
        }
        System.out.println(number);
        scanner.close();
    }
}

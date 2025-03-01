import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println();
            }
        }
        scanner.close();

    }
}

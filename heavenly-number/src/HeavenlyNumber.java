import java.util.Scanner;

public class HeavenlyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "Heavenly number";
        System.out.println("Please write a number:");
        int number = scanner.nextInt();
        if (number < 100 && number % 2 == 0 && number % 7 != 0) {
            System.out.println(message);
        } else if (number > 300 && number % 13 == 0) {
            System.out.println(message);
        } else {
            System.out.println("Not a " + message);
        }
    }
}

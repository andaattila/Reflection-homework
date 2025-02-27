import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number and I will show you what the Fizz Buzz is! ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.err.println("Please enter a number greater than 0!");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0 && i % 3 != 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
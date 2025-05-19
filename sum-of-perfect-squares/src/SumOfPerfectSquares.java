import java.util.Scanner;

public class SumOfPerfectSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int number = scanner.nextInt();
        if (number < 1) {
            System.err.println("Your number is incorrect");
        } else {
            System.out.println(calculateSumOfPerfectSquare(number));
        }
        scanner.close();
    }

    public static int calculateSumOfPerfectSquare(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += (int) Math.pow(i, 2);
        }
        return sum;
    }
}

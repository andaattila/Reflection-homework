import java.util.Scanner;

public class LargeTask {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a number between 50 and 10.000");
            number = scanner.nextInt();
        } while (!isNumberValid(number));
        int[] squares = generateSquareNumbers(number);
        int sum = 0;
        for (int i = 4; i < squares.length; i += 5) {
            sum += squares[i];
        }
        System.out.println(sum);
        scanner.close();
    }

    public static boolean isNumberValid(int number) {
        return number > 50 && number < 10_000;
    }

    public static int[] generateSquareNumbers(int number) {
        int size = 0;
        for (int i = 1; i <= number; i++) {
            if (Math.pow(i, 2) < number) {
                size++;
            } else {
                break;
            }
        }
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <= size; j++) {
                numbers[i] = (int) Math.pow(j, 2);
                i++;
            }
        }
        return numbers;
    }
}

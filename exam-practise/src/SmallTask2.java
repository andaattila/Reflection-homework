import java.util.Scanner;

public class SmallTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        System.out.println("Please enter 6 numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number <= min) {
                min = number;
            }
            if (number >= max) {
                max = number;
            }
        }
        System.out.println(Math.sqrt(max-min));

        scanner.close();
    }
}

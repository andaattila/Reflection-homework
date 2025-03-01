import java.util.Scanner;

public class BasicAlgorithms {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the numbers in the array is: " + sum);

        int prod = 1;
        for (int i = 0; i < numbers.length; i++) {
            prod *= numbers[i];
        }
        System.out.println("The production of the numbers in the array is: " + prod);
        int strangeNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                strangeNumber += numbers[i];
            } else {
                strangeNumber -= numbers[i];
            }
        }
        System.out.println(strangeNumber);
        scanner.close();
    }
}
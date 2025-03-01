import java.util.Scanner;

public class SumTheNumbersSkippingTheFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];

        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        System.out.println("I'll compute the sum of the numbers in the array skipping every fourth element.");
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i % 4 != 3) {
                sum += myArray[i];
            }

        }
        System.out.println("The sum of the array is:" +sum);
        scanner.close();
    }
}

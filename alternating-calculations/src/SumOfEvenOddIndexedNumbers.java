import java.util.Scanner;

public class SumOfEvenOddIndexedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        System.out.println("Fill the array with " + arraySize + " numbers");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        System.out.println("I'll sum the numbers following this pattern: n0−n1+n2−n3+n4−n5+… ");

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                sum += myArray[i];
            } else {
                sum -= myArray[i];
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}

import java.math.BigDecimal;
import java.util.Scanner;

public class AlternatingPowerAndDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        if (arraySize % 2 != 0) {
            System.err.println("The number of elements is not even!");
        } else {
            int[] myArray = new int[arraySize];
            System.out.println("Enter the numbers, and I'll calculate the sum of them following pattern: n1^n2÷n3^n4×n5^n6÷n7^n8×n9^n10");
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = scanner.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (i % 2 == 0) {
                    double[] powArray = new double[myArray.length / 2];
                    for (int j = 0; j < powArray.length; j++) {
                        powArray[j] = Math.pow(myArray[i], myArray[i + 1]);
                    }
                    System.out.println(powArray[1]);
                }
            }
        }


        scanner.close();


    }
}

import java.util.Scanner;

public class AlternatingMultiplicationAndDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will compute the following pattern: n1×n2÷n3×n4×n5÷n6×n7×n8÷n9… ");
        System.out.println();
        System.out.print("Please enter the size of the Array:");
        int sizeOfTheArray = scanner.nextInt();
        System.out.println("Enter the numbers to fill the array! ");

        int[] myArray2 = new int[sizeOfTheArray];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = scanner.nextInt();
        }
        //index:    0,1,2,3,4,5,6,7,8,9,...
        //operator: *,*,/,*,*,/,*,*,/,*,...
        int result = 1;
        for (int i = 0; i < myArray2.length; i++) {
            if (i % 3 == 2) {
                result /= myArray2[i];
            } else {
                result *= myArray2[i];
            }
        }
        System.out.println(result);

        scanner.close();
    }
}

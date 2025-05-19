import java.util.Scanner;

//Write a program that asks 5 numbers from the user
// and prints to the console whether they are perfect squares AND even numbers or not

public class SmallTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if ((Math.sqrt(numbers[i]) * 10 % 10 == 0) && numbers[i] % 2 != 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scanner.close();
    }
}

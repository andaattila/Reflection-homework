import java.util.Scanner;

public class PrimeLister {
    static Scanner scanner = new Scanner(System.in);


    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int counter = 0;
        int number = -1;
        boolean isValid = false;
        while (number < 0 || number >= Integer.MAX_VALUE-1 && counter < 5) {
            System.out.println("Please enter your number:");
            number = scanner.nextInt();
            counter++;
            isValid = true;
        }
        if (isValid) {
            if (counter >= 5) {
                System.err.println("You reached the input limit!");

            } else {
                System.out.println("The primes till your number:");

                if (number >= 0) {
                    for (int i = 2; i <= number; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + ", ");
                        }
                    }
                } else {
                    System.out.println("not a isValid number");
                }
            }
            scanner.close();
        }
    }
}

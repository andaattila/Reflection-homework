import java.util.Scanner;

public class FirstLoopHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a text and after a number:");
        String text = scanner.nextLine();
        int n = scanner.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(text);
            }
        } else {
            System.err.println("Your number is smaller than zero!");
        }
        System.exit(0);
    }
}
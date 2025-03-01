import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= userInput; i++) {
            result += i;
        }
        System.out.println(result);
    }
}

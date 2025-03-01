import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number, and I will show you which month it is:");
        int number = scanner.nextInt();
        if (number < 1 || number > 12) {
            System.err.println("Wrong number!");
        } else {
            switch (number) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days month");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days month");
                    break;
                case 2:
                    System.out.println("28/29 days month");
                    break;
            }
        }
    }
}
// I need to change something to give new commit message.
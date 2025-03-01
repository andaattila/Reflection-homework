import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number:");
        int number = scanner.nextInt();
        String january = ("31");
        String february = ("28/29");
        String march = ("31");
        String april = ("30");
        String may = ("31");
        String june = ("30");
        String july = ("31");
        String august = ("31");
        String september = ("30");
        String october = ("31");
        String november = ("30");
        String december = ("31");
        if (number == 1) {
            System.out.println("January " + january);
        } else if (number == 2) {
            System.out.println("February " + february);

        } else if (number == 3) {
            System.out.println("March " + march);

        } else if (number == 4) {
            System.out.println("April " + april);

        } else if (number == 5) {
            System.out.println("May " + may);
        } else if (number == 6) {
            System.out.println("June " + june);
        } else if (number == 7) {
            System.out.println("July " + july);
        } else if (number == 8) {
            System.out.println("August " + august);
        } else if (number == 9) {
            System.out.println("September " + september);
        } else if (number == 10) {
            System.out.println("October " + october);
        } else if (number == 11) {
            System.out.println("November " + november);
        } else if (number == 12) {
            System.out.println("December " + december);
        } else {
            System.out.println("Wrong input");
        }
    }
}// I renamed the folder
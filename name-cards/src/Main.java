import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] datas = new String[5];
        System.out.println("Please enter your name:");
        datas[0] = scanner.nextLine();
        System.out.println("Please enter your e-mail address:");
        datas[1] = scanner.nextLine();
        System.out.println("Please enter your phone number:");
        datas[2] = scanner.nextLine();
        System.out.println("Please enter your age:");
        datas[3] = scanner.nextLine();
        System.out.println("Please enter your website:");
        datas[4] = scanner.nextLine();

        int maxLength = 0;
        for (String data : datas) {
            if (data.length() > maxLength) {
                maxLength = data.length();
            }
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print("+-");
        }
        System.out.println();
        for (String data : datas) {
            int remain = maxLength - data.length();
            System.out.print("| " + data);
            for (int j = 0; j < remain; j++) {
                System.out.print(" ");
            }
            System.out.println(" | ");
            for (int i = 0; i < maxLength; i++) {
                System.out.print("+-");
            }
            System.out.println();
        }
        scanner.close();
    }
}


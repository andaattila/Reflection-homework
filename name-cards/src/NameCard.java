import java.util.Scanner;

public class NameCard {
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

        int textLength = 0;
        for (String data : datas) {
            if (data.length() > textLength) {
                textLength = data.length();
            }
        }
for(String data:datas) {
    System.out.println("+-+");
    System.out.printf("%-5" + textLength + "%|s+5", datas[0]);
}

        scanner.close();
    }
}

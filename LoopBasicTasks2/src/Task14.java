public class Task14 {
    public static void main(String[] args) {
        System.out.println("Writes every number from 1 to 200 that is neither divisible by 2 nor by 5");
        System.out.println();
        int startNr = 1;
        int endNr = 200;
        int divider1 = 2;
        int divider2 = 5;

        for (int i = startNr; i <= endNr; i++) {
            if (i % divider1 != 0 && i % divider2 != 0) {
                System.out.println(i);
            }
        }
    }
}

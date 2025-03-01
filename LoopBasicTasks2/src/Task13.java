public class Task13 {
    public static void main(String[] args) {
        System.out.println("Writes every number between 1 and 500 that is not divisible by 3");
        System.out.println();
        int startNr = 1;
        int endNr = 500;
        int divider = 3;
        for (int i = startNr; i <= endNr; i++) {
            if (i % divider != 0) {
                System.out.println(i);
            }
        }
    }
}

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Writes every number that is multiple of 7 between 1 and 200");

        int startNr = 1;
        int endNr = 200;
        int divider = 7;

        for (int i = startNr; i <= endNr; i++) {
            if (i % divider == 0) {
                System.out.println(i);
            }
        }
    }
}

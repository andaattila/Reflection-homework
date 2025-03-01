public class Task8 {
    public static void main(String[] args) {
        System.out.println("Writes all numbers from 1 to 100, that are divisible by 3 and 4");

        int startNr = 1;
        int endNr = 100;
        int divisible1 = 3;
        int divisible2 = 4;

        for (int i = startNr; i <= endNr; i++) {
            if (i % divisible1 == 0 && i % divisible2 == 0) {
                System.out.println(i);
            }
        }
    }
}

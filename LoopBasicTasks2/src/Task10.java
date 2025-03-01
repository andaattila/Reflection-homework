public class Task10 {
    public static void main(String[] args) {
        System.out.println("Calculates the product of all the numbers between 1 to 10");
        int startNr = 1;
        int endNr = 10;
        int result = 1;

        for (int i = startNr; i <= endNr; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}

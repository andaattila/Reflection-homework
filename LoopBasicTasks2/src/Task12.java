public class Task12 {
    public static void main(String[] args) {
        System.out.println("Writes the square root of the numbers between from 1 to 10");
        System.out.println();
        int startNr = 1;
        int endNr = 10;

        for (int i = startNr; i <= endNr; i++) {
            double squareRoot = Math.sqrt(i);
            System.out.println(squareRoot);
        }
    }
}

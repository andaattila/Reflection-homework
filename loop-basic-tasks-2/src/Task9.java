public class Task9 {
    public static void main(String[] args) {
        System.out.println("Writes the sum of all even numbers from 1 to 100");
        System.out.println();
        int startNr = 1;
        int endNr = 100;
        int result = 0;
        for (int i = startNr; i <= endNr; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println("The sum of all even number between 1 and 100: " + result);
    }
}

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Writes every integer from 100 to 1 in reverse order");
        int startNr = 100;
        int endNr = 1;
        int step = 1;
        for (int i = startNr; i >= endNr; i -= step) {
            System.out.println(i);
        }
    }
}

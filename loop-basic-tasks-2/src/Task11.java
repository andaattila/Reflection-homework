import java.security.spec.RSAOtherPrimeInfo;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Decrements the number from 1000 to 500 by 10 each step");
        System.out.println();
        int startNr = 1000;
        int endNr = 500;
        int step = 10;

        for (int i = startNr; i >= endNr; i -= step) {
            System.out.println(i);
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Writes every multiple of 5 from 5 to 100");
        for (int i = 5; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

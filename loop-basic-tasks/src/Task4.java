public class Task4 {
    public static void main(String[] args) {
        System.out.println("Write every odd value to from 1 to 500");
        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

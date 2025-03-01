public class Task9 {
    public static void main(String[] args) {
        System.out.println("Calculates the average of the first 20 natural numbers");
        int sum = 0;
        double counter = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
            counter++;
        }
        double average = sum / counter;
        System.out.println(average);
    }
}

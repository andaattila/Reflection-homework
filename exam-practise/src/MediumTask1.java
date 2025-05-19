public class MediumTask1 {
    public static int sumMultiplesWithIndex(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * i;
        }
        return sum;
    }

    public static void main(String[] args) {
    }
}

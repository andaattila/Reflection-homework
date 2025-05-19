public class MediumTask2 {
    public static void main(String[] args) {
    }

    public static int sumNumbersMultiplierWithPattern(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 4 == 0) {
                sum += numbers[i];
            }
            if (i % 4 == 1) {
                sum += numbers[i] * 2;
            }
            if (i % 4 == 2) {
                sum -= numbers[i];
            }
            if (i % 4 == 3) {
                sum -= numbers[i] * 2;
            }
        }
        return sum;
    }
}

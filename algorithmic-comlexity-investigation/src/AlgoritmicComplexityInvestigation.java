public class AlgoritmicComplexityInvestigation {

    public static void main(String[] args) {

    }

    // Write a method that takes in an array and 2 numbers and returns whether the sum of two numbers at two
    // different indexes can add up to that number
    public static boolean checkSumOfTwoNumbersInTheArray(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (temp + numbers[j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkSumOfThreeNumbers(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

public class SumSeveralNumbers {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

        int[] array = {2, 4, 64, 21, 7, 4, 2, 7, 3, 32};
        int sumOfTheArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfTheArray += array[i];
        }
        int z = number1 + number2 + sumOfTheArray;

        System.out.println("The sum of the numbers is: " + z);
    }
}
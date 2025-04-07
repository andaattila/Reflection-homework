public class ArrayFun {

    // 1. Return the average of all even numbers in an array of integers.

    public static int calculateAverage(int[] array) {
        int sum = 0; //integer because even numbers
        int counter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                sum += element;
                counter++;
            }
        }
        return sum / counter;
    }

    // 2. Return a new array with each number squared only if the original number was odd.
    public static int[] generateArraySquareOfOdds(int[] array) {
        int size = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                size++;
            }
        }
        int[] arrayOfSquares = new int[size];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayOfSquares[j] = array[i] * array[i];
                j++;
            }
        }
        return arrayOfSquares;
    }

    // 3. Return the number of strings that start with the letter "a" or "A".
    public static int calculateNumberOfStrings(String[] texts) {
        int sum = 0;
        for (String text : texts) {
            if (text.charAt(0) == 'a' || text.charAt(0) == 'A') {
                sum++;
            }
        }
        return sum;
    }

    //4. Return the concatenation of all strings that are longer than 3 characters.
    public static String concatenateTextsLongerThan3(String[] texts) {
        StringBuilder sb = new StringBuilder();
        for (String text : texts) {
            if (text.length() >= 3) {
                sb.append(text);
            }
        }
        return sb.toString();
    }

    //5.Return true if the array of integers contains any consecutive duplicates.
    public static boolean checkDuplicates(int[] numbers) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==numbers[i+1]){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

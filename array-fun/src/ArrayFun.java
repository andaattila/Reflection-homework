import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayFun {

    // 1. Return the average of all even numbers in an array of integers.

    public static int calculateAverage(int[] array) {
        int sum = 0;
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
        boolean isTrue = false;
        int result = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (result == numbers[i + 1]) {
                isTrue = true;
                break;
            } else {
                result = numbers[i + 1];
            }
        }
        return isTrue;
    }

    /*6. Return the total number of vowels in a 2D array of strings.
    (you don’t have to consider non-English vowels, only a, e, i, o and u).
     */

    public static int calculateVowels(String[][] texts) {
        int result = 0;
        for (String[] text : texts) {
            for (String text2 : text) {

                for (int i = 0; i < text2.length(); i++) {
                    Character.toLowerCase(text2.charAt(i));
                    if (text2.charAt(i) == 'a' || text2.charAt(i) == 'e' || text2.charAt(i) == 'i' || text2.charAt(i) == 'o' || text2.charAt(i) == 'u') {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    //7. Return the sum of the lengths of the longest string from each row (subarray).

    public static int calculateSumOfTheLongest(String[][] texts) {
        int sum = 0;
        for (String[] subtexts : texts) {
            for (String subtext : subtexts) {
                for (int i = 0; i <= subtext.length(); i++) {
                    if (i > sum) {
                        sum = i;
                    }
                }
            }
        }
        return sum;
    }

    //8. Return a one-dimensional (in other words: flattened) array of all strings in uppercase.
    public static String[] makeFlattenedArrayWithUppercase(String[][] texts) {
        int size = 0;
        for (int i = 0; i < texts.length; i++) {
            for (int j = 0; j < texts.length; j++) {
                texts[i][j] = texts[i][j].toUpperCase();
                size++;
            }
        }
        String[] flatArray = new String[size];
        for (int i = 0; i < flatArray.length; i++) {
            for (int j = 0; j < texts.length; j++) {
                for (int k = 0; k < texts.length; k++) {
                    flatArray[i] = texts[j][k];
                    i++;
                }
            }
        }
        return flatArray;
    }


    //9. Return a new 2D array of booleans where each element is true if the corresponding string contains a digit.
    public static boolean[][] fillWhenDigitOnTheStrings(String[][] texts) {

        boolean[][] isTrue = new boolean[texts.length][];
        for (int i = 0; i < texts.length; i++) {
            isTrue[i] = new boolean[texts[i].length];
        }
        for (int i = 0; i < texts.length; i++) {
            for (int j = 0; j < texts[i].length; j++) {
                isTrue[i][j] = texts[i][j].matches(".*\\d.*");
            }
        }
        return isTrue;
    }

    //10. Return the average number of characters per string across all elements.
    public static double calculateAverageNumber(String[][] texts) {

        int numberOfStrings = 0;
        int numberOfCharacters = 0;

        for (String[] text1 : texts) {
            for (String text2 : text1) {
                numberOfCharacters += text2.length();
            }
        }
        for (String[] text1 : texts) {
            for (String text2 : text1) {
                numberOfStrings++;
            }
        }
        return numberOfCharacters / (double) numberOfStrings;
    }

    public static void main(String[] args) {
    }
}

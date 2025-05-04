import java.beans.PropertyEditorSupport;

public class MethodPractice2 {
    //1. Writes your own name to the console

    public static void writeMyName(String name) {
        System.out.println(name);
    }
    //2. Writes a welcome message to the console

    public static void writeWelcomeMessage(String message) {
        System.out.println(message);
    }
    //3. Gets in a number and returns its 30%

    public static double calculateThe30Percent(int number) {
        return number * 0.3;
    }
    //4. Gets in an array of Strings and returns an empty String

    public static String returnAnEmptyString(String[] texts) {
        return "";
    }
    //5.Gets in a number and returns its 42.8%

    public static double calculateAStrangeNumber(int number) {
        return (double) number * 0.428;
    }
    //6. Gets in a String and returns the double of its length

    public static int calculateTheDoubleLengthOfString(String text) {
        return text.length() * 2;
    }
    //7. Gets in two numbers and returns how much you would need to add to the first number to get the second one

    public static int calculateTheNeededNumber(int first, int second) {
        return second - first;
    }
    //8. Gets in a String and returns the square root of its length

    public static double calculateSquareRootOfAStringLength(String text) {
        return Math.sqrt(text.length());
    }
    //9. Gets in a String and returns the factorial of its length

    public static long calculateFactorialOfAStringLength(String text) {
        long result = 1;
        for (int i = 1; i <= text.length(); i++) {
            result *= i;
        }
        return result;
    }
    //10. Gets in a number and returns 100 divided by that number

    public static double calculateAWeirdNumber(int number) {
        return 100 / (double) number;
    }
    //11. Gets in a number and returns the square of it if it is prime

    public static double calculateTheSquareIfItIsPrime(int number) {
        double result = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number % 4 == 0) {
                    return number * 2;
                } else return number * 3;
            } else {
                result = Math.pow(number, 2);
            }
        }
        return result;
    }
    //12. Gets in an array of Strings and returns a new array of numbers of each String’s length

    public static int[] calculateStringsLength(String[] texts) {
        int[] array = new int[texts.length];
        for (int i = 0; i < texts.length; i++) {
            array[i] = texts[i].length();
        }
        return array;
    }
    //13. Gets in a gross salary and calculates the net salary according to the Hungarian rules in the following way:

    //deduces 15% as SZJA (personal income tax) and 18.5% as TBJ (social security tax)
    public static double calculateNetSalary(int grossSalary) {
        return grossSalary - calculateSZJA(grossSalary) - calculateTBJ(grossSalary);
    }

    public static double calculateTBJ(int grossSalary) {
        return grossSalary * 0.185;
    }

    public static double calculateSZJA(int grossSalary) {
        return grossSalary * 0.15;
    }

    //14. Gets in an array of booleans and returns a1 XOR a2 XOR a3 … XOR an
    public static boolean decideTrueOrFalse(boolean[] array) {
        boolean result = false;
        for (boolean element : array) {
            result = result ^ element;
        }
        return result;
    }

    //15. Gets in an array of numbers and returns a new array with all the negative numbers in from the original array
    public static int[] collectNegativeNumbersInAnArray(int[] numbers) {
        int size = 0;
        int index = -1;
        for (int number : numbers) {
            if (number < 0) {
                size++;
            }
        }
        int[] arrayOfNegatives = new int[size];
        for (int number : numbers) {
            if (number < 0) {
                index++;
                arrayOfNegatives[index] = number;
            }
        }
        return arrayOfNegatives;
    }

    public static void main(String[] args) {
        writeMyName("Anda Attila");
        writeWelcomeMessage("Hello! Welcome!");
    }
}
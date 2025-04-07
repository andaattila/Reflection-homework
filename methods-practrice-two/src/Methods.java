public class Methods {
    public static int calculateStringLength(String input) {
        return input.length();
    }

    public static int calculateDouble(int number) {
        return number * 2;
    }

    public static int calcualteFactorial(int number) {
        int factorial = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
        return 0;
    }

    public static int calculateCube(int number) {
        return number * number * number;
    }

    public static boolean checkResult(boolean[] array) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            result &= array[i];
        }
        return result;
    }

    public static int[] findOddIndexNumbers(int[] array) {

        int[] result = new int[array.length / 2];
        //{5,6,7} --> {6}
        //{5,6,7,8} -->{6,8}
        //{4,6,8,9,3} -->{6,9} az output mindig a fele lefelé kerekítve
        for (int i = 1, j = 0; i < array.length; i += 2, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // Gets in an array of numbers and returns the sum with those that are below 100
    public static int addNumbersBelow100(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 100) {
                result += array[i];
            }
        }
        return result;
    }

    public static int[] collectNumbersBetweenMinus113And258(int[] array) {
        //   int counter = countElements(array);
        int[] result = new int[countElements(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (isBetweenMinus113And258(array[i])) {
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }

    private static boolean isBetweenMinus113And258(int array) {
        return array >= -113 && array <= 258;
    }

    private static int countElements(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isBetweenMinus113And258(array[i])) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        System.out.println(calculateStringLength("valami"));
    }
}

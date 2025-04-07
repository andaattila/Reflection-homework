public class Practice {
    public static int calculateTriple(int number) {
        return number * 3;
    }

    public static int calculateAbsoluteProduct(int[] array) {
        int result = 1;
        for (int number : array) {
            int actualNumber = number < 0 ? -number : number;
            if (actualNumber % 13 != 0) {
                result *= actualNumber;
            }
        }
        return result;
    }
//Math.abs - same

    public static int[] findIndexes(int[] array) {
        int size = countElements(array);
        int[] returnArray = new int[size];
        return generateArray(array, returnArray);
    }

    public static int[] generateArray(int[] array, int[] returnArray) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                returnArray[j] = i;
                j++;
            }
        }
        return returnArray;
    }

    public static int countElements(int[] array) {
        int size = 0;
        for (int element : array) {
            if (element % 3 == 0) {
                size++;
            }
        }
        return size;
    }

    public static String characters(char[] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

    public static String revert(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public static int calculateWeirdSum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number % 5 == 0) {
                result += number;
            }
        }
        return result;
    }

    public static int[] generateStrangeArray(int[] numbers) {
        int[] strangeArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strangeArray[i] = (int) Math.pow(numbers[i], i + 1);
        }
        return strangeArray;
    }

    public static int sumStringLengths(String[] texts) {
        int result = 0;
        for (String text : texts) {
            result += text.length();
        }
        return result;
    }

    public static int sumTripleOfLength(String[][] texts) {
        String[][] something = {
                {"hello", "dog", "cat"},
                {"one", "two", "three"}
        };
        int result = 0;
        for (String[] subtext : texts) {
            for (String text : subtext) {
                result += text.length();
            }
        }
        return 3 * result;
    }

    public static String concatenateWithoutTs(String[][][] texts) {
        StringBuilder sb = new StringBuilder();
        for (String[][] subText1 : texts) {
            for (String[] subText2 : subText1) {
                for (String text : subText2) {
                    text = filterText(text);
                    sb.append(text);
                }
            }
        }
        return sb.toString();
    }

    private static String filterText(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 't' && text.charAt(i) != 'T') {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(calculateTriple(4));
    }
}
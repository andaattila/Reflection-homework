public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println("1. Decides weather a number is greater than 50. ");
        System.out.println(isGreater(433));
        System.out.println();

        System.out.println("2. Takes in two numbers and returns the greater one.");
        System.out.println(returnGreater(56, 98));
        System.out.println();

        System.out.println("3. Takes in two numbers and returns the result.");
        System.out.println(decideTheResult(99, 99));
        System.out.println();

        System.out.println("4. Writes all numbers from 1 to 100 to the console.");
        writeNumbersTo100();
        System.out.println();
        System.out.println();

        System.out.println("5: Takes in a number and writes all the numbers witch are divisible by 5 from 1 to the number. ");
        divisibleBy5(27);
        System.out.println();
        System.out.println();

        System.out.println("6. Gets in a number, and returns weather the number is a prime number.");
        System.out.println(isPrime(2));
        System.out.println();

        System.out.println("7. Gets in two numbers and returns weather the first number is divisible by the second one.");
        System.out.println(isDivisible(18, 7));
        System.out.println();

        System.out.println("8. Gets in three numbers and returns weather the product of the first and second numbers is equal to the third one");
        System.out.println(isTheProductEquals(3, 5, 16));
        System.out.println();

        System.out.println("9. Gets in a number (n), and writes the firs n cubic numbers to the console.");
        addCubicNumbers(3);
        System.out.println();
        System.out.println();

        System.out.println("10. Gets in a number (n) and writes the cubic numbers to the console up to that number. ");
        writeCubicNumbersToN(64);
        System.out.println();
        System.out.println();

        System.out.println("11.Gets in an array and a number and returns whether the sum of any two numbers at different indexes can add up to that number");
        System.out.println(isThereTwoNumbersSumEqualsN(6, 3, 3, 1, 8));
        System.out.println();

        System.out.println("12. Gets in a String and a positive number and returns the String repeated n times. If the number is smaller than 1, return an empty String");
        System.out.println(repeatTextNTimes("cat", 5));
        System.out.println();

        System.out.println("13. Gets in an array of strings and concatenates them into one string ");
        System.out.println(concatenateStrings("run", "read", "listen", "sleep"));
        System.out.println();

        System.out.println("14. Gets in a two-dimensional array and returns the sum of all of the numbers.");
        int[][] numbers = {{10, 20, 30}, {15, 25, 35}};
        System.out.println(sumTheElements(numbers));

        System.out.println("15. Gets in a two-dimensional array, and returns a one dimensional one, with the sum of the subarrays. ");
        int[][] mainArray = {{1, 1, 1, 1}, {1, 0, 0}, {1, 2, 3}, {2, 2, 2, 2}};
        System.out.println();
    }

    //1. Decides weather a number is greater than 50.
    public static boolean isGreater(int greaterNumber) {
        return greaterNumber > 50;
    }

    //2. Takes in two numbers and returns the greater one.
    public static int returnGreater(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    //3. Takes in two numbers, and returns a String, which describe the result.
    public static String decideTheResult(int number1, int number2) {
        if (number1 > number2) {
            return "number1 is is greater";
        }
        if (number2 > number1) {
            return "number2 is greater";
        }
        return "the numbers are equal.";
    }

    //4. Writes all the numbers form 1 to 100.
    public static void writeNumbersTo100() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
        }
    }

    //5. Gets a number as input parameter and writes all numbers that are divisible by 5 from 1 up to the number
    public static void divisibleBy5(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ",");
            }
        }
    }

    //6. Gets a number and returns weather that the number is a prime number.
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    //7. Gets in two numbers and returns weather the first is divisible by the second one.
    public static boolean isDivisible(int number1, int number2) {
        return (number1 % number2 == 0);
    }


    //8. Gets in three numbers and return weather the product of the first and second number is equal to the third number.
    public static boolean isTheProductEquals(int number1, int number2, int number3) {
        return (number1 * number2 == number3);
    }

    //9. Gets in a number (n) and writes the first n cubic numbers to the console.
    public static void addCubicNumbers(int n) {
        int powerNumber;
        for (int i = 1; i <= n; i++) {
            powerNumber = (int) Math.pow(i, 3);
            System.out.print(powerNumber + " ");
        }
    }

    //10. Gets in a number (n) and writes the cubic numbers to the console up to that number. n=64 → Output: 1, 8, 27, 64
    public static void writeCubicNumbersToN(int n) {
        int i = 1;
        int cubicNumber = 0;
        while (cubicNumber < n) {
            cubicNumber = (int) Math.pow(i, 3);
            i++;
            System.out.print(cubicNumber + " ");
        }
    }

    //11. Gets in an array and a number and returns weather the sum of any two numbers at different indexes can add up to that number.
    public static boolean isThereTwoNumbersSumEqualsN(int n, int... numbers) {
        boolean isTrue = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == n) {
                    isTrue = true;
                    break;
                }
            }
        }
        return isTrue;
    }

    //12. Gets in a String and a positive number, and returns the String repeated n times. If n smaller than 1, return an empty String.
    public static String repeatTextNTimes(String text, int n) {
        String result = "";
        if (n < 1) {
            return "";
        } else {
            for (int i = 0; i < n; i++) {
                result += " " + text;
            }
            return result;
        }
    }


    // 13. Gets in an array of Strings and concatenates them into one String.
    public static String concatenateStrings(String... actions) {
        String result="";
        StringBuilder sb = new StringBuilder();
        for (String action : actions) {
            sb.append(action);
        }
        result=sb.toString();

        return result;
    }

    //14. Gets in a two-dimensional array, and returns the sum of all of teh numbers.
    public static int sumTheElements(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        return sum;
    }

    //15. Gets in a two-dimensional array, and returns with a one-dimensional one, with the sum of the subarrays.
    public static int[] sumTheArrays(int[][] mainArray) {
        int[] sumTheArrays = new int[0];
        for (int i = 0; i < mainArray.length; i++) {
            for (int j = i; j < mainArray.length; j++) {
                sumTheArrays[i] += mainArray[i][j];
            }
        }
        return sumTheArrays;
    }
}

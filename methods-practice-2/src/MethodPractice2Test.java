import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MethodPractice2Test {
    //3.
    @Test
    void shouldReturn30Percent() {
        int number = 27;
        double expected = 8.1;
        Assertions.assertEquals(expected, MethodPractice2.calculateThe30Percent(number));
    }

    //4.
    @Test
    void shouldReturnAnEmptyString() {
        String[] texts = {"dog", "cat", "something"};
        String expected = " ";
        Assertions.assertEquals(expected, MethodPractice2.returnAnEmptyString(texts));
    }

    //5.
    @Test
    void shouldCalculateTheStrangeNumber() {
        int number = 10;
        double expected = 4.28;
        Assertions.assertEquals(expected, MethodPractice2.calculateAStrangeNumber(number));
    }

    //6.
    @Test
    void shouldCalculateTheDoubleOfString() {
        String text = "computer";
        int expected = 16;
        Assertions.assertEquals(expected, MethodPractice2.calculateTheDoubleLengthOfString(text));
    }

    //7.
    @Test
    void shouldCalculateTheNeededNumber() {
        int first = 4;
        int second = 9;
        int expected = 5;

        Assertions.assertEquals(expected, MethodPractice2.calculateTheNeededNumber(first, second));
    }

    //8.
    @Test
    void shouldCalculateTheSquareRootOfAStringLength() {
        String text = "adventure";
        double expected = 3;
        Assertions.assertEquals(expected, MethodPractice2.calculateSquareRootOfAStringLength(text));
    }

    //9.
    @Test
    void shouldCalculateFactorialOfAStringLength() {
        String text = "misunderstanding";
        long expected = 20_922_789_888_000l;
        Assertions.assertEquals(expected, MethodPractice2.calculateFactorialOfAStringLength(text));
    }

    //10.
    @Test
    void shouldCalculateAWierdNumber() {
        int number = 10;
        double expected = 10;
        Assertions.assertEquals(expected, MethodPractice2.calculateAWierdNumber(number));
    }

    //11.a.
    @Test
    void shouldCalculateTheSquareIfItIsPrime() {
        int number = 7;
        double expected = 49;
        Assertions.assertEquals(expected, MethodPractice2.calculateTheSquareIfItIsPrime(number));
    }

    //11.b.
    @Test
    void shouldCalculateTheSquareIfItIsPrime2() {
        int number = 8;
        double expected = 16;
        Assertions.assertEquals(expected, MethodPractice2.calculateTheSquareIfItIsPrime(number));
    }

    //11.c.
    @Test
    void shouldCalculateTheSquareIfItIsPrime3() {
        int number = 9;
        double expected = 27;
        Assertions.assertEquals(expected, MethodPractice2.calculateTheSquareIfItIsPrime(number));
    }

    //12.
    @Test
    void shouldReturnTheLengthOfStringInArray() {
        String[] texts = {"apple", "orange", "pear"};
        int[] array = {5, 6, 4};
        Assertions.assertArrayEquals(array, MethodPractice2.calculateStringsLength(texts));
    }

    //13.
    @Test
    void shouldCalculateNetSalary() {
        int grossSalary = 100_000;
        double netSalary = 66_500;
        Assertions.assertEquals(netSalary, MethodPractice2.calculateNetSalary(grossSalary));
    }

    //14.
    @Test
    void shouldDecideTrueOrFalse() {
        boolean[] array = {true, false, false, true, false};
        Assertions.assertFalse(MethodPractice2.decideTrueOrFalse(array));
    }

    //15.
    @Test
    void shouldCollectTheNegativeElements() {
        int[] numbers = {0, 1, -3, 55, -4, -7, 48};
        int[] arrayOfNegativeElements = {-3, -4, -7};
        Assertions.assertArrayEquals(arrayOfNegativeElements, MethodPractice2.collectNegativeNumbersInAnArray(numbers));
    }
}

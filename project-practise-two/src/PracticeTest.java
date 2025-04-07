import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeTest {
    @Test
    void shouldReturnAbsoluteProduct() {
        assertEquals(9, Practice.calculateTriple(4));
    }

    @Test
    void shouldReturnCalculateAbsolute() {
        int[] arrayToTest = {-2, 5, -8, 2, 1};
        assertEquals(160, Practice.calculateAbsoluteProduct(arrayToTest));
    }

    @Test
    void shouldReturnIndexes() {
        int[] testArray = {-15, -5, 0, 12, 11};
        int[] expectedArray = {0, 2, 3};
        assertArrayEquals(expectedArray, Practice.findIndexes(testArray));
    }

    @Test
    void shouldAppendChars() {
        char[] array = {'k', 'u', 't', 'y', 'a'};
        assertEquals("kutya", Practice.characters(array));
    }

    @Test
    void shouldReverse() {
        String string = "Hello";
        assertEquals("olleH", Practice.reverseString(string));
    }

    @Test
    void shouldRevert() {
        assertEquals("olleH", Practice.revert("Hello"));
    }

    @Test
    void shouldReturnWeirdSum() {
        int[] numbers = {-54, -20, 0, 15, 39};
        assertEquals(-5, Practice.calculateWeirdSum(numbers));
    }

    @Test
    void shouldGenerateStrangeArray() {
        int[] numbers = {-15, 2, 0, 3, 1};
        int[] expected = {-15, 4, 0, 81, 1};
        assertArrayEquals(expected, Practice.generateStrangeArray(numbers));
    }

    @Test
    void shouldSumStringLengths() {
        String[] texts = {"one", "two", "apple"};
        int length = 11;
        assertEquals(length, Practice.sumStringLengths(texts));
    }

    @Test
    void shouldConcatenateWithoutTs() {
        String[][][] texts = {
                {
                        {"a", "tr", "f"}, {"e", "g"}
                },
                {
                        {"f"}, {"e", "g"}
                },
                {
                        {"3", "ff", "rT"}, {"t", "gf", "h"}
                }
        };
        String finalString = "arfegfeg3ffrgfh";
        assertEquals(finalString, Practice.concatenateWithoutTs(texts));

    }
}

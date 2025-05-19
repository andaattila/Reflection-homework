import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargeTaskTest {
    @Test
    void shouldNumberBetween50And10000() {
        int number = 51;
        Assertions.assertTrue(LargeTask.isNumberValid(number));

    }

    @Test
    void shouldGenerateArrayOfSquares() {
        int number = 100;
        int[] expected = {1, 4, 9, 16, 25,36,49,64,81};
        Assertions.assertArrayEquals(expected, LargeTask.generateSquareNumbers(number));
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfPerfectSquaresTest {
    @Test
    void shouldCalculateSumOfPerfectSquares() {
        int number = 4;
        int excepted = 30;
        Assertions.assertEquals(excepted, SumOfPerfectSquares.calculateSumOfPerfectSquare(number));
    }
}

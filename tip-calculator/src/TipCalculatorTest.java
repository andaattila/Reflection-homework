import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    @Test
    void testSumShouldEqual() {

        int[] numbers = {1, 5, 8, 9, 3};

        Assertions.assertEquals(26, TipCalculator.sumTheCosts(numbers));
    }

    @Test
    void testShouldCheckPercentage() {
        //given
        double percentage = 90.0;
        // when
        int result = TipCalculator.checkThePercentage(percentage);
        //then
        Assertions.assertEquals(-1, result);
    }

    @Test
    void testShouldCheckPercentage2() {
        //given
        double percentage = 10.0;
        // when
        int result = TipCalculator.checkThePercentage(percentage);
        //then
        Assertions.assertEquals(10, result);
    }
}


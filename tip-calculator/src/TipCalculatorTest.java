import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TipCalculatorTest {
    @Test
    public void testSumShouldEqual() {

        int[] numbers = {1, 5, 8, 9, 3};

        Assertions.assertEquals(26, TipCalculator.sumTheCosts(numbers));

    }
}

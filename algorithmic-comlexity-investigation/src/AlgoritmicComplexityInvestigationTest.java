import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoritmicComplexityInvestigationTest {
    @Test
    void shouldCheckSumOfTwoNumbersInTheArray() {
        int[] numbers = {1, 3, 5, 8, 10, 0};
        int first = 6;
        Assertions.assertTrue(AlgoritmicComplexityInvestigation.checkSumOfTwoNumbersInTheArray(numbers, first));
    }

    @Test
    void shouldCheckSumOfTwoNumbersInTheArray2() {
        int[] numbers = {1, 3, 5, 8, 10, 0};
        int first = 7;
        Assertions.assertFalse(AlgoritmicComplexityInvestigation.checkSumOfTwoNumbersInTheArray(numbers, first));
    }

    @Test
    void shouldCheckSum() {
        int[] numbers = {2, 5, 6, 7, 34};
        int number = 13;
        Assertions.assertTrue(AlgoritmicComplexityInvestigation.checkSumOfThreeNumbers(numbers, number));
    }
}

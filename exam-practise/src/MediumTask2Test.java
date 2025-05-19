import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediumTask2Test {
    @Test
    void shouldSumNumbersMultiplierWithPattern() {
        int[] numbers = {1, 2, 3, 4};
        int excepted = -6;
        Assertions.assertEquals(excepted, MediumTask2.sumNumbersMultiplierWithPattern(numbers));
    }
}

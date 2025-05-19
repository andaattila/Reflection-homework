import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediumTask1Test {
    @Test
    void shouldSumMultiplesWithIndex() {
        int[] numbers = {2, 4, 6};
        int excepted = 16;
        Assertions.assertEquals(excepted, MediumTask1.sumMultiplesWithIndex(numbers));
    }

}

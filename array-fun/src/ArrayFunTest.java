import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFunTest {
    @Test
    void shouldCalculateAverage() {
        int[] array = {-35, -10, 0, 3, 10, 15, 20};
        int result = 5;
        Assertions.assertEquals(result, ArrayFun.calculateAverage(array));
    }

    @Test
    void shouldGenerateArraySquareOfOds() {
        int[] array = {-7, -6, -3, 0, 1, 3, 5, 8};
        int[] expected = {49, 9, 1, 9, 25};
        Assertions.assertArrayEquals(expected, ArrayFun.generateArraySquareOfOdds(array));
    }

    @Test
    void shouldCalculateNumberOfStrings() {
        String[] texts = {"Apple", "car", "able", "Mouse", "purple", "append", "Aladar"};
        int expected = 4;
        Assertions.assertEquals(expected, ArrayFun.calculateNumberOfStrings(texts));
    }

    @Test
    void shouldConcatenateTextsLongerThan3() {
        String[] texts = {"The", "cat", "no", "yes", "is", "a", "animal"};
        String expected = "Thecatyesanimal";
        Assertions.assertEquals(expected, ArrayFun.concatenateTextsLongerThan3(texts));
    }
    @Test
    void shouldCheckDuplicates(){
        int[]numbers = {-12,35,35,0,15,12,68,96,35};
        Assertions.assertTrue(ArrayFun.checkDuplicates(numbers));
    }

}

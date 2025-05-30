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
    void shouldCheckDuplicates() {
        int[] numbers = {-12, 35, 6, 0, 0, 15, 12, 0, 68, 96, 35};
        Assertions.assertTrue(ArrayFun.checkDuplicates(numbers));
    }

    @Test
    void shouldCalculateVowels() {
        String[][] texts = {{"dog", "cat", "eat"}, {"red", "blue", "nice"}, {"bird", "keyboard"}};
        int expected = 13;
        Assertions.assertEquals(expected, ArrayFun.calculateVowels(texts));
    }

    @Test
    void shouldCalculateSumOfTheLongest() {
        String[][] texts = {{"apple", "rainbow", "mouse"}, {"red", "carrot", "deep"}, {"cat", "dog", "eat"}};
        int expected = 7;
        Assertions.assertEquals(expected, ArrayFun.calculateSumOfTheLongest(texts));
    }

    @Test
    void shouldMakeFlattenedArrayWithUppercase() {
        String[][] texts = {{"red", "Rose", "Gun"}, {"black", "Bull", "big"}, {"white", "Star", "yellow"}};
        String[] flattened = {"RED", "ROSE", "GUN", "BLACK", "BULL", "BIG", "WHITE", "STAR", "YELLOW"};
        Assertions.assertArrayEquals(flattened, ArrayFun.makeFlattenedArrayWithUppercase(texts));
    }

    @Test
    void shouldFillWhenDigitOnTheString() {
        String[][] texts = {{"dog2", "cat", "Jerry1"}, {"red", "blue3"}, {"1car", "null", "Zer0"}};
        boolean[][] expected = {{true, false, true}, {false, true}, {true, false, true}};
        Assertions.assertArrayEquals(expected, ArrayFun.fillWhenDigitOnTheStrings(texts));
    }

    @Test
    void shouldCalculateAverageNumber() {
        String[][] texts = {{"dog", "cat", "elephant"}, {"tiger", "lion", "pig"}, {"bird", "hawk"}};
        double expected = 4.25;
        Assertions.assertEquals(expected, ArrayFun.calculateAverageNumber(texts));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSmallExcercisesTest {
    @Test
    void shouldSumOccurrenceOfB() {
        String inputText = "BBffFDGddbB";
        int expected = 3;
        Assertions.assertEquals(expected, StringSmallExercises.calculateTheOccurrenceOfB(inputText));
    }

    @Test
    void shouldSumOccurrenceOfB2() {
        String inputText = "abc";
        int expected = 0;
        Assertions.assertEquals(expected, StringSmallExercises.calculateTheOccurrenceOfB(inputText));
    }

    @Test
    void shouldCountOccurrenceOfHello() {
        String text = "helloabcdhelloasvbhellogdvmhello";
        int expected = 4;
        Assertions.assertEquals(expected, StringSmallExercises.countOccurrenceOfHello(text));
    }

    @Test
    void shouldCountOccurrencesOfHello2() {
        String text = "lovely string";
        int expected = 0;
        Assertions.assertEquals(expected, StringSmallExercises.countOccurrenceOfHello(text));
    }
}

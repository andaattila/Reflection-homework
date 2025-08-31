package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExchangerTest {
    @Test
    void shouldExchangeTheLettersToStars() {
        String text = "This is the EXAM";
        String expected = "Th*s *s th* *X*M";
        Assertions.assertEquals(expected, Exchanger.letterExchanger(text));
    }
}

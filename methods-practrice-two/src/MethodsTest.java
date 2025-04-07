import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MethodsTest {
    @Test
    void shouldReturnDouble() {
        //given
        int number = 3;
        //when
        int result = Methods.calculateDouble(number);
        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    void shouldReturnFactorial() {
        //given
        int number = 6;
        //when
        int result = Methods.calcualteFactorial(number);
        //then
        Assertions.assertEquals(720, result);
    }

    @Test
    void shouldReturnCube() {
        //given
        int number = 3;
        //when
        int result = Methods.calculateCube(number);
        //then
        Assertions.assertEquals(27, result);

    }

    @Test
    void shouldReturnResult() {
        boolean[] array = {true, true, true, true};
        boolean result = Methods.checkResult(array);
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnOdd() {
        int[] expected = new int[]{6, 6, 2};
        int[] expected2 = new int[]{2, 5, 3};
    }

    @Test
    void shouldReturnTheSum() {

        int[] array = {1, 3, 4, 5, 6, 8, 100, 1000};
        int result = Methods.addNumbersBelow100(array);

        Assertions.assertEquals(16, result);
    }

    @Test
    void shouldReturnNumbersBetweenMinus113And258() {
        int[] array = {-254, -114, -113, 0, 69, 258, 259, 5987};
        int[] expected = {-113, 0, 69, 258};
        Assertions.assertArrayEquals(expected,Methods.collectNumbersBetweenMinus113And258(array));
    }

    //TODO

}


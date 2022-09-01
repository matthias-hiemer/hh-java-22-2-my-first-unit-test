import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplierTest {

    @Test
    void multiplyTest(){
        // Given
        int number1 = 7;
        int number2 = 4;

        // WHEN
        int actual = Multiplier.multiply(number1, number2);

        // THEN
        assertEquals(28, actual);
    }
}

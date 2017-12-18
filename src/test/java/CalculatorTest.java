import org.junit.Test;

import static java.lang.Double.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition() {
        double addition = Calculator.addition(2.5, 7);
        assertEquals(addition, 9.5, MIN_VALUE);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        double addition = Calculator.addition(-2.5, -7);
        assertEquals(addition, -9.5, MIN_VALUE);
    }

    @Test
    public void testAdditionWithZero() {
        double addition = Calculator.addition(0, 0);
        assertEquals(addition, 0, MIN_VALUE);
    }

    @Test
    public void testSubtraction() {
        double subtraction = Calculator.subtraction(10, 5);
        assertEquals(subtraction, 0, MIN_VALUE);
    }
}

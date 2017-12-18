import org.junit.Assert;
import org.junit.Test;

import static java.lang.Double.MIN_VALUE;

public class CalculatorTest {
    @Test
    public void testAddition() {
        double addition = Calculator.addition(2.5, 7);
        Assert.assertEquals(addition, 9.5, MIN_VALUE);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        double addition = Calculator.addition(-2.5, -7);
        Assert.assertEquals(addition, -9.5, MIN_VALUE);
    }

    @Test
    public void testAdditionWithZero() {
        double addition = Calculator.addition(0, 0);
        Assert.assertEquals(addition, 0, MIN_VALUE);
    }
}

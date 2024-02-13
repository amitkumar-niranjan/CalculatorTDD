import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
    @Test
    public void testSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }
    @Test
    public void testTwoNumbers() {
        assertEquals(3, StringCalculator.add("1,2"));
    }
    @Test
    public void testAnyAmountOfNumbers() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }
    @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

}
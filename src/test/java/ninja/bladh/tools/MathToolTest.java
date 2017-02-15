package ninja.bladh.tools;

import org.junit.Assert;
import org.junit.Test;

public class MathToolTest {

    private static final int[] integers = {2, 6, 2, 3, 7, 2, 7, 9, 3, 5, 0, 5, 3, 36, 994, 34, 5};
    private static final int[] floors = {2, 2, 2, 3, 2, 2, 7, 3, 3, 0, 0, 3, 3, 36, 34, 5};
    private static final int[] ceilings = {6, 6, 3, 7, 7, 7, 9, 9, 5, 5, 5, 5, 36, 994, 994, 34};

    @Test
    public void testAddition() {
        for (int i = 1; i < integers.length; i++) {
            int a = integers[i - 1];
            int b = integers[i];
            int result = MathTool.addition(a, b);
            Assert.assertEquals(a + " + " + b + " != " + result, a + b, result);
        }
    }

    @Test
    public void testSubtraction() {
        for (int i = 1; i < integers.length; i++) {
            int a = integers[i - 1];
            int b = integers[i];
            int result = MathTool.subtraction(a, b);
            Assert.assertEquals(a + " - " + b + " != " + result, a - b, result);
        }
    }

    @Test
    public void testFloor() {
        for (int i = 1; i < integers.length; i++) {
            int a = integers[i - 1];
            int b = integers[i];
            int result = MathTool.floor(a, b);
            Assert.assertEquals("Trying to floor " + a + " and " + b + " is not producing the expected value", floors[i - 1], result);
        }
    }

    @Test
    public void testCeiling() {
        for (int i = 1; i < integers.length; i++) {
            int a = integers[i - 1];
            int b = integers[i];
            int result = MathTool.ceiling(a, b);
            Assert.assertEquals("Trying to ceiling " + a + " and " + b + " is not producing the expected value", ceilings[i - 1], result);
        }
    }
}

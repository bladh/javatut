package ninja.bladh.tools;

import org.junit.Assert;
import org.junit.Test;

public class StringToolTest {

    private static final String[] names = {"mario", "lUiGi", "sonic the hedgehog", "john smiTH", "agent one-two"};
    private static final String[] niceNames = {"Mario", "Luigi", "Sonic The Hedgehog", "John Smith", "Agent One-Two"};
    private static final String[] basic_strings = {"addition", "subtraction", "floor", "ceiling"};
    private static final String[] wrangled_strings = {"Addition", "SuBtRaCtIoN", "flOOr", "  ceiling   "};
    private static final String[] wrong_strings = {"hello", "world", "java", "stuff"};
    private static final String[] str_ints = {"1", "2", "24", "44", "42"};
    private static final int[] integers = {1, 2, 24, 44, 42};

    @Test
    public void beautifyTest() {
        for (int i = 0; i < names.length; i++) {
            String result = StringTool.beautify(names[i]);
            Assert.assertEquals("Name is not formatted correctly", niceNames[i], result);
        }
    }

    @Test
    public void matchTest() {
        for (int i = 0; i < basic_strings.length; i++) {
            Assert.assertTrue("Strings should match: " + basic_strings[i] + " and " + wrangled_strings[i],
                StringTool.match(basic_strings[i], wrangled_strings[i]));
            Assert.assertFalse("Strings should not match: " + basic_strings[i] + " and " + wrong_strings[i],
                StringTool.match(basic_strings[i], wrong_strings[i]));
            Assert.assertFalse("Strings should not match: " + wrangled_strings[i] + " and " + wrong_strings[i],
                StringTool.match(wrangled_strings[i], wrong_strings[i]));
        }
    }

    @Test
    public void toIntegerTest() {
        for (int i = 0; i < str_ints.length; i++) {
            int integer = StringTool.toInteger(str_ints[i]);
            Assert.assertEquals("The integer is not converted correctly", integers[i], integer);

        }
    }
}

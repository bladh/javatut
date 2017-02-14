package ninja.bladh.tools;

public class StringTool {

    /**
     * Some users report being lazy with typing, but do not appreciate
     * their names looking like a mess when greeted by the program.
     * <p>
     * This method will make sure that the first letter in the name is
     * Capitalised, and will do so even if there are multiple names
     * in the string.
     */
    public static String beautify(String string) {
        return "";
    }


    /**
     * The less lazy users report that the interface is too dumb to realize
     * that when they type "Addition", they mean "addition".
     * The fumbling users report that if they accidentally hit space,
     * then the program doesn't realize "addition " means "addition".
     * <p>
     * This method will make both strings lowercase and then check for
     * equality. It will also make sure that there are no spaces in the
     * string before checking equality.
     */
    public static boolean match(String a, String b) {
        return false;
    }

    /**
     * The current way of input only gives us strings, but we need
     * integers for the math to work.
     * <p>
     * This method should convert a string into an integer and return it.
     */
    public static int toInteger(String string) {
        return -1;
    }
}

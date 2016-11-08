package Calculator;

/**
 * Created by marvinpiekarek on 04.11.16.
 */
public class CalculatorTest {

    /**
     * ad-hoc-test for the Calculator Class
     * Test coverage 100% as of 5th November
     * @param args program paraments not needed.
     */
    public static void main(String[] args) {
        // invalid arguments, wrong count ...
        Calculator.main(new String[]{"kk", "6"});
        // invalid operator
        Calculator.main(new String[]{"2", "kk", "6"});
        // invalid number
        Calculator.main(new String[]{"a", "div", "0"});

        // divide by zero
        Calculator.main(new String[]{"2", "div", "0"});
        // divide normal
        Calculator.main(new String[]{"2", "div", "2"});
        // subtract normal
        Calculator.main(new String[]{"2", "sub", "2"});
        // multiply normal
        Calculator.main(new String[]{"2", "mul", "2"});
        // add normal
        Calculator.main(new String[]{"2", "add", "1"});
    }

}

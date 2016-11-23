import calculator.Calculator;

/**
 * Employee testing class
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public class CalculatorTest {

    /**
     * Ad-hoc-tests
     * @param args unused.
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
        // divide floating point
        Calculator.main(new String[]{"22", "div", "7"});
        // subtract normal
        Calculator.main(new String[]{"2", "sub", "2"});
        // multiply normal
        Calculator.main(new String[]{"2", "mul", "2"});
        // add normal
        Calculator.main(new String[]{"2", "add", "1"});
    }

}

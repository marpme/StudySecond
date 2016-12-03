package comparator;

/**
 * Class description ...
 * Included in comparator
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
class Integer {

    private int value;

    Integer(int w) {
        value = w;
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Integer{ " +
                "value=" + value +
                " }";
    }
}
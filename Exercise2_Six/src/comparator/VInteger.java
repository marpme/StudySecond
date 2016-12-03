package comparator;

/**
 * Class description ...
 * Included in comparator
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
class VInteger extends Integer implements Comparable {

    VInteger(int value) {
        super(value);
    }

    @Override
    public int compare(Comparable obj) {
        if (obj == null) {
            System.out.println("Object is null.");
            return 1;
        } else if (!(obj instanceof Integer)) {
            System.out.println("Different object types.");
            return 1;
        } else {
            Integer a = (Integer) obj;
            if (this.getValue() - a.getValue() > 0) {
                return 1;
            } else if (this.getValue() - a.getValue() == 0) {
                return 0;
            } else {
                return -1;
            }
        }

    }

    @Override
    public String toString() {
        return "VInteger{ \n" +
                "   " + super.toString()
                + "\n}";
    }
}

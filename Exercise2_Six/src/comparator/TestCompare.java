package comparator;

/**
 * Class description ...
 * Included in comparator
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public class TestCompare {

    public static void main(String[] args) {

        Comparable[] arr = new Comparable[]{new VInteger(-21), new VInteger(1213), null, new VInteger(1)};
        Comparable[] arrk = new Comparable[]{null, null, null, null};
        //Comparable k = new VInteger(2);
        //Comparable v = new VInteger(8);
        System.out.println(Utilities.smallestElement(arrk));
        //System.out.println(Utilities.highestElement());
    }

}

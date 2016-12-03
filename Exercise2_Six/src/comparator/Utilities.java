package comparator;

/**
 * Utilites Class for handling with comparables
 * Included in comparator
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
 class Utilities {

    /**
     * Finds the smallest object
     *
     * @param arr array of comparable items.
     * @return the smallest comparable Value or null if error
     */
    static Comparable smallestElement(Comparable[] arr) {
        arr = checkArray(arr);
        if (arr != null) {
            return sort(arr)[0];
        }
        return null;
    }

    /**
     * Finds the highest object
     *
     * @param arr array of comparable items.
     * @return the highest comparable Value or null if error
     */
    static Comparable highestElement(Comparable[] arr) {
        arr = checkArray(arr);
        if (arr != null) {
            return sort(arr)[arr.length - 1];
        }
        return null;
    }

    /**
     * Checking the array by filtering out null, empty arrays
     * null array values or different classes.
     *
     * @param arr array of comparables
     * @return a boolean if correct or not
     */
    private static Comparable[] checkArray(Comparable[] arr) {
        if (arr == null || arr.length <= 0) {
            System.out.println("The array is null.");
            return null;
        }

        //TODO: must remove any null value
        //TODO: Additionally It has to return null if every value is null.
        arr = removeNull(arr);

        if(arr == null || arr.length > 0){
            String defaultClassName = arr[0].getClass().toString();

            for (Comparable comparable : arr) {
                if (!comparable.getClass().toString().equals(defaultClassName)) {
                    return null;
                }
            }
            return arr;
        }else{
            return null;
        }

    }

    /**
     * Selection implemented for Comparable arrays
     *
     * @param arr with the given data
     * @return the descending sorted array
     */
    private static Comparable[] sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compare(arr[j]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /*private static Comparable[] removeAllNull(Comparable[] symbols){
        int counter = 0;
        for (int i = 0; i < symbols.length; i++) {
            //if(symbols[i].compare(null))
        }
    }*/

    private static Comparable[] removeNull(Comparable[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == null) {
                Comparable[] copy = new Comparable[symbols.length - 1];
                System.arraycopy(symbols, 0, copy, 0, i);
                System.arraycopy(symbols, i + 1, copy, i, symbols.length - i - 1);
                return copy;
            }
        }
        return symbols;
    }
}

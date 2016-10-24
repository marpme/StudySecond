/**
 * Created by kyon on 24.10.16.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(ggt(88, 64));
        System.out.println(ggtRecursive(64, 88));
    }

    public static void printUserMenu(String[] functions){

    }

    /**
     * Searches for the greatest divisor for both numbers
     * (based on the Euklid algorithm - recursively)
     * @param value Integer value
     * @param value2 Integer value2
     * @return Integer as greatest divisor
     */
    public static int ggtRecursive(int value, int value2){

        int bigger = value > value2 ? value : value2;
        int lower = value > value2 ? value2 : value;

        if(bigger % lower == 0){
            return lower;
        }

        lower = bigger % lower;
        return ggtRecursive(bigger, lower);

    }

    /**
     * Searches for the greatest divisor for both numbers
     * (based on the Euklid algorithm - iterative)
     * @param value Integer value
     * @param value2 Integer value2
     * @return Integer as greatest divisor
     */
    public static int ggt(int value, int value2){
        int bigger = value > value2 ? value : value2;
        int lower = value > value2 ? value2 : value;
        int rest = 1;

        while(rest != 0){
            rest = bigger % lower;
            if(rest != 0){
                lower = rest;
            }
        }

        return lower;
    }

}

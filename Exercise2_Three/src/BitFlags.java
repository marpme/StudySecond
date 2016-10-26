/**
 * BitFlags Class for operating with single bit
 * switchOn, off, swap and check if set.
 * @author Marvin Piekarek
 * @date 27. Oct 2016
 * @Matrikel s0556014
 * @module programming II
 */
public class BitFlags {

    /**
     * Integer storing bit flags
     */
    private int status;

    /**
     * specifies the max bit length
     */
    private byte MAX_SIZE = 32;

    /**
     * getter for status
     * @return status as Integer
     */
    public int getStatus() {
        return status;
    }

    /**
     * custom constructor for initial bit flags
     * @param initFlags Integer value of custom bit flags
     */
    public BitFlags(int initFlags){
        this.status = initFlags;
    }

    /**
     * swaps on a single bit at a specific index
     * @param index Integer value which bit should be set on
     */
    public void switchOn(int index){
        if(index > MAX_SIZE) throw new IndexOutOfBoundsException();
        status = status | (1 << index - 1);
    }

    /**
     * swaps off a single bit at a specific index
     * @param index Integer value which bit should be set off
     */
    public void switchOff(int index){
        if(index > MAX_SIZE) throw new IndexOutOfBoundsException();
        status = status & ~(1 << index - 1);
    }

    /**
     * swaps on/off a single bit at a specific index
     * @param index Integer value which bit should be swapped
     */
    public void swap(int index){
        if(index > MAX_SIZE) throw new IndexOutOfBoundsException();
        status = status ^ (1 << index - 1);
    }

    /**
     * Checks if a specific bit at a specific index is set
     * @param index Integer value which tell the index
     * @return a boolean
     */
    public boolean isSet(int index){
        if(index > MAX_SIZE) throw new IndexOutOfBoundsException();

        /*
            We'll create our mask by shifting a one to left by the index that we want to check.
            And then we'll build the complementary of it to OR this with our current
            value and resolve the complementary of the last result as shown below:

            mask  => 0000 1000 0000
            cmask => 1111 0111 1111
            value => 0001 0010 1111
            OR    => 1111 0111 1111
            COR   => 0000 1000 0000

            If it is zero (0), then the bit was set, otherwise it wasn't.
         */
        return ~(status | ~(1 << index - 1)) == 0;
    }

}

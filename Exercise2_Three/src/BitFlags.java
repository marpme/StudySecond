/**
 * BitFlags Class for operating with single bit
 * switchOn, off, swap and check if set.
 * @author Marvin Piekarek
 * @date 27th Oct 2016
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
        if(index > MAX_SIZE || index < 1) throw new IndexOutOfBoundsException();
        status = status | (1 << index - 1);
    }

    /**
     * swaps off a single bit at a specific index
     * @param index Integer value which bit should be set off
     */
    public void switchOff(int index){
        if(index > MAX_SIZE || index < 1) throw new IndexOutOfBoundsException();
        status = status & ~(1 << index - 1);
    }

    /**
     * swaps on/off a single bit at a specific index
     * @param index Integer value which bit should be swapped
     */
    public void swap(int index){
        if(index > MAX_SIZE || index < 1) throw new IndexOutOfBoundsException();
        status = status ^ (1 << index - 1);
    }

    /**
     * Checks if a specific bit at a specific index is set
     * @param index Integer value which tell the index
     * @return a boolean
     */
    public boolean isSet(int index){
        if(index > MAX_SIZE || index < 1) throw new IndexOutOfBoundsException();

        /*
            mask  => 0000 1000 0000
            mask2 => 0000 0010 0000
            value => 0001 0010 1111
            AND   => 0000 0000 0000
            AND2  => 0000 0010 0000
            If it is zero (0), then the bit wasn't set, otherwise it was.
         */
        return (status & (1 << index - 1)) != 0;
    }

}

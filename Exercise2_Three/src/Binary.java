/**
 * Created by kyon on 26.10.16.
 */

public class Binary {

    /**
     * Turns an Integer number into bit-string
     * @param value Integer value
     * @return bit value string
     */
    public static String inBinary(int value){
        int groupSize = 4;
        String binary = "int " + value + ": ";

        for (int i = 31; i >= 0; i--){
            int mask = 1 << i;
            if(i % groupSize == 0){
                binary += (value & mask) != 0 ? 1 : 0;
                binary += " ";
            }else{
                binary += (value & mask) != 0 ? 1 : 0;
            }
        }
        return binary;
    }

}

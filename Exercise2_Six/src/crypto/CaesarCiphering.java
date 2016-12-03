package crypto;

/**
 * CaesarEncryption Method, implements encryptor
 * Included in crypto
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 01. Dec 2016
 */
public class CaesarCiphering implements Encryptor {

    /**
     * Standard alphabet to determine the position
     */
    private char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /**
     * Shifter int, based on the value chars get shifted.
     */
    private int shift;

    /**
     * Constructor with custom shifting
     * @param shift int to shift
     */
    public CaesarCiphering(int shift){
        this.shift = shift;
    }

    /**
     * Constructor with no parameters (3 shifts)
     */
    public CaesarCiphering(){
        this.shift = 3;
    }


    /**
     * Encrypts a char based on the encryption method
     *
     * @param c char to encrypt
     * @return encrypted char
     */
    @Override
    public char encryptChar(char c) {
        int index = getIndexOfChar(c);
        int newIndex = Math.floorMod((index + shift), alphabet.length);
        return index == -1 ? c : alphabet[newIndex];
    }

    /**
     * Decrypts a char based on the encryption method
     *
     * @param c char to decrypt
     * @return decrypted char
     */
    @Override
    public char decryptChar(char c) {
        int index = getIndexOfChar(c);
        int newIndex = Math.floorMod((index - shift), alphabet.length);
        return index == -1 ? c : alphabet[newIndex];
    }

    /**
     * Get the index of the given char
     *
     * @param c char to search for
     * @return -1 if not found otherwise index.
     */
    private int getIndexOfChar(char c){
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == c){
                return i;
            }
        }
        return -1;
    }

}

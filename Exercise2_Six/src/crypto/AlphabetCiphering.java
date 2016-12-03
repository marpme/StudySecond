package crypto;

import java.util.Arrays;

/**
 * Alphabet ciphering, implements encryptor
 * Included in crypto
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 01. Dec 2016
 */
public class AlphabetCiphering implements Encryptor {

    /**
     * Ciphered alphabet
     */
    private char[] cipherbet;

    /**
     * Alphabet for decrypting
     */
    private char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public AlphabetCiphering(char[] m){
        cipherbet = Arrays.copyOf(m, m.length);
    }

    /**
     * Encrypts a char based on the encryption method
     *
     * @param c char to encrypt
     * @return encrypted char
     */
    @Override
    public char encryptChar(char c) {
        int index = getIndexOfChar(c, alphabet);
        return index == -1 ? c : cipherbet[index];
    }

    /**
     * Decrypts a char based on the encryption method
     *
     * @param c char to decrypt
     * @return decrypted char
     */
    @Override
    public char decryptChar(char c) {
        int index = getIndexOfChar(c, cipherbet);
        return index == -1 ? c : alphabet[index];
    }

    /**
     * Get the index of the given char
     *
     * @param c char to search for
     * @return -1 if not found otherwise index.
     */
    private int getIndexOfChar(char c, char[] ch){
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == c){
                return i;
            }
        }
        return -1;
    }

}

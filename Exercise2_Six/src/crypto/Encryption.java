package crypto;

/**
 * Encryption class, wrapper class for ciphering methods
 * Included in crypto
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 01. Dec 2016
 */
public class Encryption {

    /**
     * Encrypt a string based on the given encryptor
     *
     * @param text String to encrypt
     * @param cy an encryptor
     * @return the encrypted text
     */
    public static String encrypt(String text, Encryptor cy){
        char[] a = text.toCharArray();
        for (int i = 0; i < text.toCharArray().length; i++) {
            a[i] = cy.encryptChar(a[i]);
        }
        return new String(a);
    }

    /**
     * Decrypt a string based on the given encryptor
     *
     * @param text String to decrypt
     * @param cy an encryptor
     * @return the decrypted text
     */
    public static String decrypt(String text, Encryptor cy){
        char[] a = text.toCharArray();
        for (int i = 0; i < text.toCharArray().length; i++) {
            a[i] = cy.decryptChar(a[i]);
        }
        return new String(a);
    }

}

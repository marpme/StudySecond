package crypto;

/**
 * Encryptor interface for all cipher methods
 * Included in crypto
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 01. Dec 2016
 */
public interface Encryptor {

    /**
     * Encrypts a char based on the encryption method
     *
     * @param c char to encrypt
     * @return encrypted char
     */
    char encryptChar(char c);

    /**
     * Decrypts a char based on the encryption method
     *
     * @param c char to decrypt
     * @return decrypted char
     */
    char decryptChar(char c);

}

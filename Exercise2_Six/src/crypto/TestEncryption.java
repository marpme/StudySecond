package crypto;

import java.util.Arrays;
import java.util.Random;

/**
 * Test class for encryption's
 * Included in crypto
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 01. Dec 2016
 */
public class TestEncryption {

    /**
     * Main entry
     *
     * @param args useless args
     */
    public static void main(String[] args) {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        shuffleArray(alphabet);
        System.out.println(Arrays.toString(alphabet));

        String a = "Ich kaufe mir heute Abend 10 Brötchen.";


        Encryptor cipher = new CaesarCiphering(3);
        String b = Encryption.encrypt(a, cipher);
        System.out.println(b);
        String h = Encryption.decrypt(b, cipher);
        System.out.println(h);

        Encryptor kappa = new AlphabetCiphering(alphabet);
        b = Encryption.encrypt(a, kappa);
        System.out.println(b);
        h = Encryption.decrypt(b, kappa);
        System.out.println(h);

    }

    /**
     * Shuffles an array randomly
     *
     * @param ar array to shuffle
     */
    private static void shuffleArray(char[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            char a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}

import java.util.Arrays;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 24. Dec 2016
 */
public class Main {

private static String lab = "###########\n" +
                            "#0.1.....2#\n" +
                            "#.#######.#\n" +
                            "#4.......3#\n" +
                            "###########";

    public static void main(String[] args) {

        int c = 1;
        for (char labc : lab.toCharArray()) {
            if(labc == '\n') c++;
        }
        int columns = lab.length() / c;
        String[] kapp = lab.split("\n");
        char[][] k = new char[c][columns];
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                k[i][j] = kapp[i].toCharArray()[j];
            }
        }

        for (int i = 0; i < k.length; i++) {
            System.out.println(Arrays.toString(k[i]));
        }

        Labyrinth lab = new Labyrinth(k, c, columns);
    }

}

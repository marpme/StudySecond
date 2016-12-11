/**
 * Created by marvinpiekarek on 25/11/2016.
 */

public class Main {

    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("j = " + i + ": " + doubleHash(19, i, 7, 5));
        }

    }

    private static int doubleHash(int k, int j, int m, int m2){
        return ((k % m) - j * (1 + k % m2)) % m;
    }

}


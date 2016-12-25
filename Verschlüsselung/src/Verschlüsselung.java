/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 21. Dec 2016
 */
public class Verschlüsselung {

    private static String key = "GHU NXUV PDFKW VSDVV DL LVW SULPD";

    public static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        char[] a = alpha.toCharArray();
        for (int i = 1; i < alpha.length(); i++) {
            StringBuilder test = new StringBuilder();
            for (char k : key.toCharArray()) {

                if(alpha.indexOf(k) >= 0){
                    char c = a[(alpha.indexOf(k) + i) % alpha.length()];
                    test.append(c);
                }else{
                    test.append(k);
                }

            }

            System.out.println("[" + i + "] - " + test);
        }

    }





}

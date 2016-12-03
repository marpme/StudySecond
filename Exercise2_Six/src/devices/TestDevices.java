package devices;

import devices.Fax;
import devices.LaserPrinter;
import devices.MultiDevice;

/**
 * Class description ...
 * Included in main
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public class TestDevices {

    public static void main(String[] args) {
        LaserPrinter l1 = new LaserPrinter();
        LaserPrinter l2 = new LaserPrinter();
        Fax f1 = new Fax();
        Fax f2 = new Fax();
        MultiDevice k1 = new MultiDevice();
        MultiDevice k2 = new MultiDevice();
        String text = "This is a test.";

        f1.send(text);
        f2.send(text);
        l1.print(text);
        l2.print(text);
        k1.send(text);
        k2.send(text);
        k1.print(text);
        k2.print(text);
    }

}

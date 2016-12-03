package devices;

/**
 * laser printer simulation class, implements printer
 * Included in devices
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public class LaserPrinter implements IPrinter{

    /**
     * Static counter for all printer devices
     */
    private static int counter = 0;

    /**
     * Name of the current laser printer
     */
    private String name = "LaserPrint";

    /**
     * Constructor for setting the name
     */
    public LaserPrinter(){
        counter++;
        this.name += " " + counter;
    }

    /**
     * Command to print out your current ref data
     *
     * @param refData String holding all your print data
     */
    @Override
    public void print(String refData) {
        System.out.println("Sender is " + name);
        System.out.println(PRINT_SIMULATION);
        System.out.println(refData);
    }
}

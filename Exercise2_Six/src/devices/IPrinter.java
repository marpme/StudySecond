package devices;

/**
 * Class description ...
 * Included in devices
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public interface IPrinter {

    /**
     * String for simulating a print action
     */
    String PRINT_SIMULATION = "Printing is being simulated.";

    /**
     * Command to print out your current ref data
     * @param refData String holding all your print data
     */
    void print(String refData);

}

package devices;

/**
 * MultiDevice simulation class, implements printer and fax
 * Included in devices
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public class MultiDevice implements IFax, IPrinter{

    /**
     * Static counter for all multi count devices
     */
    private static int counter = 0;

    /**
     * Name of the current multi device
     */
    private String name = "MultiDevice";

    /**
     * Constructor for setting the name
     */
    public MultiDevice(){
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
        System.out.println(this.PRINT_SIMULATION);
        System.out.println(refData);
    }

    /**
     * Sends data through the fax machine
     *
     * @param refData is a string holding your data you want to send.
     */
    @Override
    public void send(String refData) {
        System.out.println("Sender is " + name);
        System.out.println(this.FAX_SIMULATION);
        System.out.println(refData);
    }
}

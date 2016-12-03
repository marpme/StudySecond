package devices;

/**
 * fax simulation class, implements fax
 * Included in devices
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public class Fax implements IFax {

    /**
     * Static counter for all fax devices
     */
    private static int counter = 0;

    /**
     * Name of the current fax
     */
    private String name = "Fax";

    /**
     * Constructor for setting the name
     */
    public Fax(){
        counter++;
        this.name += " " + counter;
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

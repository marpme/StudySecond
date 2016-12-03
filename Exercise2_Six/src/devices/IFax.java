package devices;

/**
 * Class description ...
 * Included in devices
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 29. Nov 2016
 */
public interface IFax {

    /**
     * String for simulating a fax action
     */
    String FAX_SIMULATION = "Faxing is being simulated.";

    /**
     * Sends data through the fax machine
     * @param refData is a string holding your data you want to send.
     */
    void send(String refData);
}

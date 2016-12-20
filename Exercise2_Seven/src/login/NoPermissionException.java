package login;

/**
 * No permission exception
 * will be thrown if you try to access methods,
 * that are only accessible while being logged in.
 * Included in login
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 11. Dec 2016
 */
public class NoPermissionException extends Exception {

    /**
     * Constructor
     */
    public NoPermissionException(){
        super();
    }

    /**
     * Custom constructor with a given message
     * @param message the message
     */
    public NoPermissionException(String message){
        super(message);
    }

}

package login;

/**
 * Login Exception
 * will be used if the authentication goes wrong
 * Included in login
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 11. Dec 2016
 */
public class LoginException extends Exception {

    /**
     * Constructor
     */
    public LoginException(){
        super();
    }

    /**
     * Custom constructor with a given message
     * @param message the message
     */
    public LoginException(String message){
        super(message);
    }
}

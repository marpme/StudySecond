package login;

/**
 * Class description ...
 * Included in login
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 11. Dec 2016
 */
public class NoPermissionExecption extends Exception {

    public NoPermissionExecption(){
        super();
    }

    public NoPermissionExecption(String message){
        super(message);
    }

}

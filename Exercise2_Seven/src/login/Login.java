package login;

/**
 * Login class
 * Included in login
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 11. Dec 2016
 */
public class Login {

    private boolean isAuthenticated;

    /**
     * Logs the user with his password in.
     *
     * @param user the provided username
     * @param password the corresponding password
     * @throws LoginException will be thrown, if username and password aren't matching.
     */
    public void login(String user, String password) throws LoginException {
        if(user.equals("test") && password.equals("password")){
            isAuthenticated = true;
        }else{
            throw new LoginException("Login failed. Wrong username or password.");
        }
    }

    /**
     * Logs you out.
     */
    public void logout() {
        if(isAuthenticated) {
            isAuthenticated = false;
        }
    }

    /**
     * Working process
     * Only accessible if you are logged in.
     *
     * @throws NoPermissionException will be throw if you try to use
     *         this method while not being logged in.
     */
    public void working() throws NoPermissionException {
        if(isAuthenticated){
            System.out.println("Working ...");
        }else {
            throw new NoPermissionException("You've no permission to execute this method. Please login before.");
        }
    }

}

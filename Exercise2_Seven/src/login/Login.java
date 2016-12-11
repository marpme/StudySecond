package login;

/**
 * Class description ...
 * Included in login
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 11. Dec 2016
 */
public class Login {

    private boolean angemeldet;

    public void anmelden(String benutzer, String passwort) throws LoginException {
        if(benutzer.equals("test") && passwort.equals("password")){
            angemeldet = true;
        }else{
            throw new LoginException("Login failed. Wrong username or password.");
        }
    }

    public void abmelden() {
        if(angemeldet) {
            angemeldet = false;
        }
    }

    public void bearbeiten() throws NoPermissionExecption {
        if(angemeldet){
            System.out.println("Working ...");
        }else {
            throw new NoPermissionExecption("You've no permission to execute this method. Please login before.");
        }
    }

}

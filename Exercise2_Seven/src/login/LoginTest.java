package login;

import java.util.Scanner;

/**
 * Ad-hoc test class
 * Included in login
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 11. Dec 2016
 */
public class LoginTest {

    /**
     * Main Entry point for testing purposes
     * @param args unused...
     */
    public static void main (String[] args) {
        Login login = new Login();
        Scanner input = new Scanner (System.in);
        String user;
        String passwort;

        System.out.print ("Please enter a username: ");
        user = input.next();
        System.out.printf("Please enter the corresponding password (%s): ", user);
        passwort = input.next();

        try {
            System.out.println ("Sie werden angemeldet ...");
            login.login(user, passwort);
            System.out.println ("Anmeldung erfolgreich!");
        }
        catch (LoginException ex) {
            System.out.println (ex.getMessage());
        }

        try {
            System.out.println ("Methode working() wird aufgerufen ...");
            login.working();
        }
        catch (NoPermissionException ex) {
            System.out.println (ex.getMessage());
        }

        System.out.println ("Sie werden abgemeldet ...");
        login.logout();

        try {
            System.out.println ("Methode working() wird aufgerufen ...");
            login.working();
        }
        catch (NoPermissionException ex) {
            System.out.println (ex.getMessage());
        }
    }
}

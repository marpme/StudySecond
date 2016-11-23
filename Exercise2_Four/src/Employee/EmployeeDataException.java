package employee;

/**
 * Employee Constructor Exception
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public class EmployeeDataException extends Exception {

    /**
     * Custom constructor for Exceptions
     * @param name name of the wrong variable
     * @param data data which has been filled in
     */
    public EmployeeDataException(String name, String data){
        System.out.printf("Changes will be revoked. Please correct that data: %n  - { %s: '%s' }%n", name, data);
    }

}

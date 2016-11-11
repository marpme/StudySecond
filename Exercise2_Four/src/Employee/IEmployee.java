package employee;

/**
 * Created by marvinpiekarek on 01.11.16.
 */
public interface IEmployee {

    String CURRENCY = "EUR";

    /**
     * Gets the name of the employee
     * @return String with the name
     */
    String getName();

    /**
     * Sets the name of the employee
     */
    void setName(String a);

    /**
     * Gets the surname of the employee
     * @return String with the surname
     */
    String getSurname();

    /**
     * Sets the surname of the employee
     */
    void setSurname(String a);

    /**
     * Gets the salary of the employee
     * @return Double with the salary
     */
    double getSalary();

    /**
     * Raises the salary of the employee
     */
    void raiseSalary(double a);

    /**
     * employee.employee data to String
     * @return String with all employee data
     */
    String toString();
}

package employee;

/**
 * Interface for Employees/Trainees
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public interface IEmployee {

    /**
     * Constant string currency €
     */
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
     * Sets the salary of the employee
     */
    void setSalary(double sal);

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

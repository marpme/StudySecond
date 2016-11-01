/**
 * Created by marvinpiekarek on 01.11.16.
 */
public class Employee implements IEmployee {

    /**
     * Name of the employee
     */
    String name = "";

    /**
     * Surname of the employee
     */
    String surname = "";

    /**
     * Salary of the employee
     */
    double salary = 0;

    public Employee(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    /**
     * Gets the name of the employee
     *
     * @return String with the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee
     */
    @Override
    public void setName(String a) {
        this.name = a;
    }

    /**
     * Gets the surname of the employee
     *
     * @return String with the surname
     */
    @Override
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the employee
     */
    @Override
    public void setSurname(String a) {
        this.surname = a;
    }

    /**
     * Gets the salary of the employee
     *
     * @return double as salary
     */
    @Override
    public double getSalary() {
        return salary;
    }

    /**
     * Raises the salary of the employee
     * @param a as raising value
     */
    @Override
    public void raiseSalary(double a) {
        salary += Math.abs(a);
    }
}

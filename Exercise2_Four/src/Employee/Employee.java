package employee;

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

    /**
     * Custom constructor for employee
     */
    public Employee(String name, String surname, double salary){
        try{
            if(name.isEmpty()){
                throw new EmployeeConstructorException("Name", "Empty");
            }
            this.name = name;
            if(surname.isEmpty()){
                throw new EmployeeConstructorException("Surname", "Empty");
            }
            this.surname = surname;
            if(salary == 0){
                throw new EmployeeConstructorException("Salary", "0");
            }
            this.salary = salary;
        }catch (EmployeeConstructorException e){
            return;
        }
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
        if(a.isEmpty()){
            System.out.println("The name must be filled.");
            return;
        }
        this.name = a;
    }

    /**
     * Gets the surname of the employee
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
        if(a.isEmpty()){
            System.out.println("The surname must be filled.");
            return;
        }
        this.surname = a;
    }

    /**
     * employee.employee data to String
     * @return String with employee data
     */
    @Override
    public String toString() {
        return "employee.employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary + ' ' + CURRENCY +
                '}';
    }

    /**
     * Gets the salary of the employee
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

package employee;

/**
 * Employee storing class with custom getter and setters
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
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
        this.setName(name);
        this.setSurname(surname);
        this.raiseSalary(salary);
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
        try{
            if(a.isEmpty()){
                throw new EmployeeDataException("name", "empty");
            }
            this.name = a;
        }catch(EmployeeDataException e){
            //ignore, no name change allowed.
        }

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
        try{
            if(a.isEmpty()){
                throw new EmployeeDataException("surname", "empty");
            }
            this.surname = a;
        }catch(EmployeeDataException e){
            //ignore, no surname change allowed.
        }
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
     * Sets the salary of the employee
     */
    @Override
    public void setSalary(double sal) {
        try{
            if(sal <= 0){
                throw new EmployeeDataException("salary", "zero or lower. Not allowed.");
            }
            this.salary = sal;
        }catch(EmployeeDataException e){
            //ignore, no surname change allowed.
        }
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

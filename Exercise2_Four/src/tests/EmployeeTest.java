import employee.Employee;

/**
 * Employee testing class
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public class EmployeeTest {

    /**
     * Ad-hoc-tests
     * @param args unused.
     */
    public static void main(String[] args) {

        // create new employee's
        Employee e1 = new Employee("Frank", "Walser", 1600);
        Employee e2 = new Employee("Eva", "Flink", 1650);
        Employee e3 = new Employee("Hans", "Boss", 4000);

        // testing all employee getters
        System.out.printf("e1 [Name: %s, Surname: %s, Salary: %s]%n", e1.getName(), e1.getSurname(), e1.getSalary());

        // set name
        e1.setName("Marvin");
        // set surname
        e1.setSurname("Piekarek");
        // raise salary
        e1.raiseSalary(199.55);

        // Print out the changed object.
        System.out.println(e1);

        // try to lower the salary by using the raise function
        e1.raiseSalary(-22);

        // should raise the salary instead of lowering it.
        System.out.println(e1);

        // now set minus salary
        e1.setSalary(-100);
        // try to set invalid name
        e1.setName("");
        // try to set invalid surname
        e1.setSurname("");

        // the object should not have changed.
        System.out.println(e1);

        // finally reset the salary
        e1.setSalary(1600);
        System.out.println(e1);
    }

}

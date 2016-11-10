package employee;


/**
 * Created by kenetix on 10.11.2016.
 */
public class EmployeeConstructorException extends Exception {

    public EmployeeConstructorException(String name, String data){
        super();
        System.out.printf("Please fill in all arguments. The following data was wrong: [%s: %s] %n", name, data);
    }

}

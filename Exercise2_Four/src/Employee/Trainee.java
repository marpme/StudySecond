package employee;

/**
 * Created by marvinpiekarek on 01.11.16.
 */
public class Trainee extends Employee implements IEmployee {

    private int traineeYear;
    private String description;

    public Trainee(String name, String surname, double salary,
                   String description, int traineeYear){
        super(name, surname, salary);
        try{
            if(description.isEmpty()){
                throw new EmployeeConstructorException("Description", "Empty");
            }
            this.description = description;
            if(traineeYear < 1 || traineeYear > 3){
                throw new EmployeeConstructorException("TraineeYear", ""+traineeYear);
            }
            this.traineeYear = traineeYear;
        }catch (EmployeeConstructorException e){
            return;
        }
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary + ' ' + CURRENCY +
                ", traineeYear=" + traineeYear +
                ", description='" + description + '\'' +
                '}';
    }

    /**
     * Gets the current trainee year
     * @return Integer as current year
     */
    public int getTraineeYear() {
        return traineeYear;
    }

    /**
     * Sets the current trainee year
     * @param traineeYear as new year
     */
    public void setTraineeYear(int traineeYear) {
        if(traineeYear < 1 || traineeYear > 3) {
            System.out.println("The trainee year must be within 1 to 3!");
            return;
        }
        this.traineeYear = traineeYear;
    }

    /**
     * Gets the job description
     * @return String with the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the job description
     * @param description as String
     */
    public void setDescription(String description) {
        if(description.isEmpty()) {
            System.out.println("The description must not be empty!");
            return;
        }
        this.description = description;
    }
}

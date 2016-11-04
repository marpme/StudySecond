/**
 * Created by marvinpiekarek on 01.11.16.
 */
public class Trainee extends Employee implements IEmployee {

    private int traineeYear;
    private String description;

    public Trainee(String name, String surname, double salary,
                   String description, int traineeYear){
        super(name, surname, salary);
        this.description = description;
        this.traineeYear = traineeYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary + '\'' +
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
        this.description = description;
    }
}

package employee;

/**
 * Trainee storing class
 * as extends the employee class
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public class Trainee extends Employee implements IEmployee {

    /**
     * the current trainee year
     */
    private int traineeYear = 1;

    /**
     * trainee position description
     */
    private String description = "";


    /**
     * Custom constructor for the trainee class
     * @param name trainee name
     * @param surname trainee surname
     * @param salary trainee salary
     * @param description trainee position description
     * @param traineeYear trainee year
     */
    public Trainee(String name, String surname, double salary,
                   String description, int traineeYear){
        super(name, surname, salary);
        this.setDescription(description);
        this.setTraineeYear(traineeYear);
    }

    /**
     * Turns the current trainee object to a string
     * @return a string of the trainee object with all details
     */
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
        try{
            if(traineeYear < 1 || traineeYear > 3) {
                throw new EmployeeDataException("TraineeYear", "out of boundries 1 <= x <= 3");
            }
            this.traineeYear = traineeYear;
        }catch(EmployeeDataException e){
            //ignore, no data change required.
        }
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
        try{
            if(description.isEmpty()) {
                throw new EmployeeDataException("description", "empty");
            }
            this.description = description;
        }catch(EmployeeDataException e){
            //ignore, no data change required.
        }
    }
}

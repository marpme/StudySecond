import employee.Trainee;

/**
 * Trainee testing class
 * @author Marvin Piekarek
 * @date 12th November 2016
 * @Matrikelnr 0556014
 */
public class TraineeTest {

    /**
     * Ad-hoc-tests
     * @param args unused.
     */
    public static void main(String[] args) {

        // create a new trainee
        Trainee t1 = new Trainee("Sven", "Vogel", 450, "EngineerTrainee", 1);

        // testing all trainee getters
        System.out.printf("t1 [Description: %s, Year: %s]%n", t1.getDescription(), t1.getTraineeYear());

        // testing description setter
        t1.setDescription("TestingDescription");
        // testing trainee year setter
        t1.setTraineeYear(2);

        // should print out the modified object
        System.out.println(t1);

        // this shouldn't work, must be filled.
        t1.setDescription("");
        // trainee years must be with 1 to 3 years.
        t1.setTraineeYear(8);

        // Nothing should have changed.
        System.out.println(t1);
    }

}

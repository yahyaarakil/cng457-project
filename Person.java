/**
 * Class that holds general person details
 */
public class Person {
    private String firstName;
    private String surname;

    /**
     * Sets the first name
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the surname
     * @param surname String
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the first name
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the surname
     * @return String
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Constructor
     * @param firstName String
     * @param surname String
     */
    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}

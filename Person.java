public class Person {
    private String firstName;
    private String surname;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
}

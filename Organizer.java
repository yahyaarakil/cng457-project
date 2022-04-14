import java.util.ArrayList;

/**
 * Class that holds all the specialized details of an organizer
 */
public class Organizer extends Person {
    private Notifier notificationSubscriber;
    private ArrayList<String> emails;
    private ArrayList<String> phoneNumbers;

    /**
     * Constructor
     * @param firstName String First name
     * @param surname String Surname
     */
    public Organizer(String firstName, String surname) {
        super(firstName, surname);
        this.notificationSubscriber = new ConcreteNotifier();
        this.emails = new ArrayList<>();
        this.phoneNumbers = new ArrayList<>();
    }

    /**
     * Gets instance of the Notifier
     * @return Notifier
     */
    public Notifier getNotificationSubscriber() {
        return notificationSubscriber;
    }

    /**
     * Gets list of emails of the organizer
     * @return ArrayList
     */
    public ArrayList<String> getEmails() {
        return new ArrayList<>(this.emails);
    }

    /**
     * Gets list of phone numbers of the organizer
     * @return
     */
    public ArrayList<String> getPhoneNumbers() {
        return new ArrayList<>(this.phoneNumbers);
    }

    /**
     * Pushes a notification to the Notifier of the organizer
     * @param festival Festival
     * @param event Event
     */
    public void pushNotification(Festival festival, Event event) {
        this.getNotificationSubscriber().notify(
                "New Event Added to festival: " + festival.getName()
                        + ". Event name: " + event.getName()
                        + ". Event description: " + event.getDescription()
                        + ". Event duration: " + event.getDuration()
                        + ". Event Details: " + event.getEventSpecificDetails()
        );
    }

    /**
     * Adds an SMS number for the organizer to be notified through
     * @param number String
     */
    public void addSMSNotification(String number){
        this.phoneNumbers.add(number);
        this.notificationSubscriber = new SMSSubscriberDecorator(this.notificationSubscriber, number);
    }

    /**
     * Adds an email number for the organizer to be notified through
     * @param email String
     */
    public void addEmailNotification(String email){
        this.emails.add(email);
        this.notificationSubscriber = new EmailSubscriberDecorator(this.notificationSubscriber, email);
    }
}

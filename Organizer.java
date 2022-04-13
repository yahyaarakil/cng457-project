import java.util.ArrayList;

public class Organizer extends Person {
    private Notifier notificationSubscriber;
    private ArrayList<String> emails;
    private ArrayList<String> phoneNumbers;

    public Organizer(String firstName, String surname) {
        super(firstName, surname);
        this.notificationSubscriber = new ConcreteNotifier();
        this.emails = new ArrayList<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public Notifier getNotificationSubscriber() {
        return notificationSubscriber;
    }

    public ArrayList<String> getEmails() {
        return new ArrayList<>(this.emails);
    }

    public ArrayList<String> getPhoneNumbers() {
        return new ArrayList<>(this.phoneNumbers);
    }

    public void pushNotification(Festival festival, Event event) {
        this.getNotificationSubscriber().notify(
                "New Event Added to festival: " + festival.getName()
                        + ". Event name: " + event.getName()
                        + ". Event description: " + event.getDescription()
                        + ". Event duration: " + event.getDuration()
                        + ". Event Details: " + event.getEventSpecificDetails()
        );
    }

    public void addSMSNotification(String number){
        this.phoneNumbers.add(number);
        this.notificationSubscriber = new SMSSubscriberDecorator(this.notificationSubscriber, number);
    }

    public void addEmailNotification(String email){
        this.emails.add(email);
        this.notificationSubscriber = new EmailSubscriberDecorator(this.notificationSubscriber, email);
    }
}

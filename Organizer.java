import java.util.ArrayList;

public class Organizer {
    private Notifier notificationSubscriber;
    private ArrayList<String> emails;
    private ArrayList<String> phoneNumbers;

    public Organizer() {
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
}

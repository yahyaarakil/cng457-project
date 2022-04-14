/**
 * Class extending BaseNotifierDecorator for SMS Notifiers
 */
public class SMSSubscriberDecorator extends BaseNotifierDecorator {
    private String number;

    /**
     * Constructor
     * @param wrapee Notifier
     * @param number String phone number
     */
    public SMSSubscriberDecorator(Notifier wrapee, String number) {
        super(wrapee);
        this.number = number;
    }

    /**
     * Method that sends out the notification. Implements notifications over SMS.
     * @param notification String notification
     */
    @Override
    public void notify(String notification) {
        System.out.println("SMS: " + notification);
        this.wrapee.notify(notification);
    }
}

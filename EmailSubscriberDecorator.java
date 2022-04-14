/**
 * The Email decorator, wraps another object of type Notifier. Implements notifications over email.
 */
public class EmailSubscriberDecorator extends BaseNotifierDecorator {
    private String email;
    /**
     * The constructor
     * @param wrapee the Notifier to be wrapped.
     * @param email String the recipient email address
     */
    public EmailSubscriberDecorator(Notifier wrapee, String email) {
        super(wrapee);
        this.email = email;
    }

    /**
     * Method that sends out the notification. Implements notifications over email.
     * @param notification String notification
     */
    @Override
    public void notify(String notification) {
        System.out.println("Email: " + notification);
        this.wrapee.notify(notification);
    }
}

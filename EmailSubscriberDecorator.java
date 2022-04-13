public class EmailSubscriberDecorator extends BaseNotifierDecorator {
    private String email;

    public EmailSubscriberDecorator(Notifier wrapee, String email) {
        super(wrapee);
        this.email = email;
    }

    @Override
    public void notify(String notification) {
        System.out.println("Email: " + notification);
        this.wrapee.notify(notification);
    }
}

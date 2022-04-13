public class SMSSubscriberDecorator extends BaseNotifierDecorator {
    private String number;

    public SMSSubscriberDecorator(Notifier wrapee, String number) {
        super(wrapee);
        this.number = number;
    }

    @Override
    public void notify(String notification) {
        System.out.println("SMS: " + notification);
        this.wrapee.notify(notification);
    }
}

/**
 * The base class that implements Notifier, to be decorated by other Notifiers
 */
public class ConcreteNotifier implements Notifier{
    /**
     * Method that sends out the notification; method to be overridden by decorators.
     * @return void
     */
    @Override
    public void notify(String notification) {
        System.out.println("Base notifier notified");
    }
}

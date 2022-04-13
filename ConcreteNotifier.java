public class ConcreteNotifier implements Notifier{
    @Override
    public void notify(String notification) {
        System.out.println("Base notifier notified");
    }
}

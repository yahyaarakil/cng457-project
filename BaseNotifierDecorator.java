abstract public class BaseNotifierDecorator implements Notifier{
    public BaseNotifierDecorator(Notifier wrapee) {
        this.wrapee = wrapee;
    }

    protected Notifier wrapee;
}

/**
 * The class that decorates the Notifier class. It is abstract and requires
 * extension.
 */
abstract public class BaseNotifierDecorator implements Notifier{
    /**
     * The constructor takes the reference to the object being wrapped and stores it
     * @param wrapee object to be wrapped, of type Notifier
     */
    public BaseNotifierDecorator(Notifier wrapee) {
        this.wrapee = wrapee;
    }

    protected Notifier wrapee;
}

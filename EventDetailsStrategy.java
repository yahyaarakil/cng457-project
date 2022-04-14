/**
 * Interface that holds the method to be overridden for generating a festival run program
 */
public interface EventDetailsStrategy {
    /**
     * Method to be overridden for generating a festival run program
     * @param event Event to be generated
     * @return String details of Event for festival run program
     */
    String getInfo(Event event);
}

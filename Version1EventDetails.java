public class Version1EventDetails implements EventDetailsStrategy {
    /**
     * Returns the name of the event
     * @param event Event to be generated
     * @return String
     */
    @Override
    public String getInfo(Event event) {
        return event.getName();
    }
}

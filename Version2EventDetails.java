public class Version2EventDetails extends Version1EventDetails {
    /**
     * Returns the name and the date of the event
     * @param event Event to be generated
     * @return String
     */
    @Override
    public String getInfo(Event event) {
        return super.getInfo(event) + ", Date: " + event.getStartTime();
    }
}

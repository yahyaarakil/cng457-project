public class Version3EventDetails extends Version2EventDetails {
    /**
     * Returns the name, date, description, and specific details of the event
     * @param event Event to be generated
     * @return String
     */
    @Override
    public String getInfo(Event event) {
        return super.getInfo(event) + "\n  Description: " + event.getDescription()+ "\n  "
                + event.getEventSpecificDetails();
    }
}

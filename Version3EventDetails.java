public class Version3EventDetails extends Version2EventDetails {
    @Override
    public String getInfo(Event event) {
        return super.getInfo(event) + "\n  Description: " + event.getDescription()+ "\n  "
                + event.getEventSpecificDetails();
    }
}

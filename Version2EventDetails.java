public class Version2EventDetails extends Version1EventDetails {
    @Override
    public String getInfo(Event event) {
        return super.getInfo(event) + ", Date: " + event.getStartTime();
    }
}

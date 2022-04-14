public class Version1EventDetails implements EventDetailsStrategy {
    @Override
    public String getInfo(Event event) {
        return event.getName();
    }
}

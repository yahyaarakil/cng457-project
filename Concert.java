import java.time.LocalDateTime;

public class Concert extends Event{
    private Performer performer;

    @Override
    public String getEventSpecificDetails() {
        return null;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public Performer getPerformer() {
        return performer;
    }

    public Concert(String name, String description, LocalDateTime startTime, LocalDateTime endTime, Performer performer) {
        super(name, description, startTime, endTime);
        this.performer = performer;
    }
}

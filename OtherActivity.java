import java.time.LocalDateTime;

public class OtherActivity extends Event{
    @Override
    public String getEventSpecificDetails() {
        return null;
    }

    public OtherActivity(String name, String description, LocalDateTime startTime, LocalDateTime endTime) {
        super(name, description, startTime, endTime);
    }
}

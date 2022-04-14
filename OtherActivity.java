import java.time.LocalDateTime;

/**
 * All the other events in a festival run
 */
public class OtherActivity extends Event{
    /**
     * No details specific to other events
     * @return Empty String
     */
    @Override
    public String getEventSpecificDetails() {
        return "";
    }

    /**
     * Constructor
     * @param name String
     * @param description String
     * @param startTime LocalDateTime
     * @param endTime LocalDateTime
     */
    public OtherActivity(String name, String description, LocalDateTime startTime, LocalDateTime endTime) {
        super(name, description, startTime, endTime);
    }
}

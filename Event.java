import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
/**
 * Event abstract class, holds the general details and methods of the events.
 */
public abstract class Event {
    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    /**
     * Sets the event name
     * @param name String new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the event description
     * @param description String new description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the event startTime
     * @param startTime LocalDateTime new startTime.
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets the event startTime
     * @param endTime LocalDateTime new endTime.
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Gets the event name
     * @return String name of concert.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the event description
     * @return String description of concert.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the event startTime
     * @return LocalDateTime startTime of concert.
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Gets the event endTime
     * @return LocalDateTime endTime of concert.
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * Constructor
     * @param name String name of concert
     * @param description String description of concert
     * @param startTime LocalDateTime startTime of concert
     * @param endTime LocalDateTime endTIme of concert
     */
    public Event(String name, String description, LocalDateTime startTime, LocalDateTime endTime) {
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Gets the duration of the event
     * @return Duration
     */
    public Duration getDuration(){
        return Duration.between(this.startTime, this.endTime);
    }

    /**
     * Abstruct method to be overridden by specializations of Event.
     * @return String specific details
     */
    abstract public String getEventSpecificDetails();
}

import java.time.LocalDateTime;
/**
 * The Concert class extends the Event class and stores the specialized details
 * of a concert.
 * @author yahyaarakil askarbozcan
 */
public class Concert extends Event{
    private Performer performer;
    /**
     * Gets the details that are specific to the concert.
     * @return String containing the only performer of the concert
     */
    @Override
    public String getEventSpecificDetails() {
        return "Performer: " + this.getPerformer().getFirstName() + " " + this.getPerformer().getSurname();
    }
    /**
     * Sets the performer of a concert in case it needs to be changes later.
     * @param performer the new instance of the performer for this concert
     */
    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    /**
     * Gets the current performer of the concert
     * @return Performer
     */
    public Performer getPerformer() {
        return performer;
    }

    /**
     * Constructs an instance of the Concert class.
     * @param name Name of the concert
     * @param description Description of the concert
     * @param startTime Start date and time of the concert
     * @param endTime End date and time of the concert
     * @param performer The performer of the concert
     */
    public Concert(String name, String description, LocalDateTime startTime, LocalDateTime endTime, Performer performer) {
        super(name, description, startTime, endTime);
        this.performer = performer;
    }
}

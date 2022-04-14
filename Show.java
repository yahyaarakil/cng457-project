import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Class that holds the details of a show extending Event
 */
public class Show extends Event{
    private ArrayList<Performer> performers;

    /**
     * Overrides the abstract class' implementation
     * @return String of the performers
     */
    @Override
    public String getEventSpecificDetails() {
        String sD = "Performers: ";
        for (Performer performer :
                this.performers) {
            sD += performer.getFirstName() + " " + performer.getSurname() + ", ";
        }
        return sD.substring(0, sD.length()-2);
    }

    /**
     * Adds a performer
     * @param performer Performer
     */
    public void addPerformer(Performer performer) {
        this.performers.add(performer);
    }

    /**
     * Gets a list of performers
     * @return ArrayList
     */
    public ArrayList<Performer> getPerformers() {
        return new ArrayList<>(this.performers);
    }

    /**
     * Constructor
     * @param name String
     * @param description String
     * @param startTime LocalDateTime
     * @param endTime LocalDateTime
     */
    public Show(String name, String description, LocalDateTime startTime, LocalDateTime endTime) {
        super(name, description, startTime, endTime);
        this.performers = new ArrayList<>();
    }
}

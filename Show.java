import java.time.LocalDateTime;
import java.util.ArrayList;

public class Show extends Event{
    private ArrayList<Performer> performers;

    @Override
    public String getEventSpecificDetails() {
        String sD = "Performers: ";
        for (Performer performer :
                this.performers) {
            sD += performer.getFirstName() + " " + performer.getSurname() + ", ";
        }
        return sD.substring(0, sD.length()-2);
    }

    public void addPerformer(Performer performer) {
        this.performers.add(performer);
    }

    public ArrayList<Performer> getPerformers() {
        return new ArrayList<>(this.performers);
    }

    public Show(String name, String description, LocalDateTime startTime, LocalDateTime endTime) {
        super(name, description, startTime, endTime);
        this.performers = new ArrayList<>();
    }
}

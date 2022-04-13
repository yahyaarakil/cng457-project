import java.time.LocalDateTime;
import java.util.ArrayList;

public class Show extends Event{
    private ArrayList<Performer> performers;

    @Override
    public String getEventSpecificDetails() {
        return null;
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

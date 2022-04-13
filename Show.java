import java.time.LocalDateTime;
import java.util.ArrayList;

public class Show extends Event{
    private ArrayList<Performer> performers;

    @Override
    public String getEventSpecificDetails() {
        return null;
    }

    public void setPerformers(ArrayList<Performer> performers) {
        this.performers = performers;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public Show(String name, String description, LocalDateTime startTime, LocalDateTime endTime, ArrayList<Performer> performers) {
        super(name, description, startTime, endTime);
        this.performers = performers;
    }
}

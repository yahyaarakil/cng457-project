import java.time.LocalDateTime;
import java.util.ArrayList;

public class FestivalRun {
    private ArrayList<Event> events;
    private String place;
    private LocalDateTime date;
    private ArrayList<Organizer> organizers;
    private Festival festival;

    public FestivalRun(String place, LocalDateTime date, Festival festival) {
        this.place = place;
        this.date = date;
        this.festival = festival;
        this.organizers = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public void addOrganizer(Organizer organizer){
        this.organizers.add(organizer);
    }

    public void addEvent(Event event){
        this.events.add(event);
    }

    public void removeOrganizer(Organizer organizer){
        this.organizers.remove(organizer);
    }

    public void removeEvent(Event event){
        this.events.remove(event);
    }

    public String generateProgram(EventDetailsStrategy strategy){
        return null;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public String getPlace() {
        return place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public ArrayList<Organizer> getOrganizers() {
        return organizers;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

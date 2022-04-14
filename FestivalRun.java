import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Class that holds data related to a specific run of a festival
 */
public class FestivalRun {
    private ArrayList<Event> events;
    private String place;
    private LocalDateTime date;
    private ArrayList<Organizer> organizers;
    private Festival festival;
    private int durationDays;

    /**
     * Constructor
     * @param place place of the festival run
     * @param date start date of the festival
     * @param durationDays duration in days of the festival
     */
    public FestivalRun(String place, LocalDateTime date, int durationDays) {
        this.place = place;
        this.date = date;
        this.organizers = new ArrayList<>();
        this.events = new ArrayList<>();
        this.festival = null;
        this.durationDays = durationDays;
    }

    /**
     * Constructor with festival instance
     * @param place place of the festival run
     * @param date start date of the festival
     * @param durationDays duration in days of the festival
     * @param festival reference to the festival which this festival run belongs to
     */
    public FestivalRun(String place, LocalDateTime date, int durationDays, Festival festival) {
        this(place, date, durationDays);
        this.festival = festival;
    }

    /**
     * Adds an organizer to the list of organizers of the festival run
     * @param organizer Organizer
     */
    public void addOrganizer(Organizer organizer){
        this.organizers.add(organizer);
    }

    /**
     * Adds an event to the list of events of the festival run and notifies all the organizers about the
     * addition
     * @param event Event
     */
    public void addEvent(Event event){
        int i;
        for (i = 0;
             i < this.events.size()
                     && this.events.get(i).getStartTime().isBefore(event.getStartTime());
             i++);
        this.events.add(i, event);
        for (Organizer organizer :
                this.organizers) {
            organizer.pushNotification(this.festival, event);
        }
    }

    /**
     * Removes an organizer from the list of organizers of the festival run
     * @param organizer Organizer
     */
    public void removeOrganizer(Organizer organizer){
        this.organizers.remove(organizer);
    }

    /**
     * Removes an event from the list of events of the festival run
     * @param event Event
     */
    public void removeEvent(Event event){
        this.events.remove(event);
    }

    /**
     * Generates a program of a festival run with specific depth of event details
     * to be displayed given a strategy depth.
     * @param strategy EventDetailsStrategy
     * @return String
     */
    public String generateProgram(EventDetailsStrategy strategy){
        String program = "";
        program += "Name: " + this.festival.getName();
        program += ", Place: " + this.getPlace();
        program += ", Date: " + this.getDate();
        program += ", Duration: " + this.durationDays + " Days\nOrganizers: \n";
        int index = 1;
        for (Organizer organizer :
                this.organizers) {
            program += index++ + ". " + organizer.getFirstName() + " " + organizer.getSurname() + "\n";
        }
        program += "Events:\n";
        index = 1;
        for (Event event :
                this.events) {
            program += index++ + ". " + strategy.getInfo(event) + "\n";
        }
        return program;
    }

    /**
     * Gets the list of events of the festival run
     * @return ArrayList
     */
    public ArrayList<Event> getEvents() {
        return this.events;
    }

    /**
     * Gets the place of the festival run
     * @return String
     */
    public String getPlace() {
        return place;
    }

    /**
     * Gets the start date of the festival run
     * @return LocalDateTime
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Gets the list of organizers of the festival run
     * @return ArrayList
     */
    public ArrayList<Organizer> getOrganizers() {
        return this.organizers;
    }

    /**
     * Gets the reference of the festival of the festival run
     * @return Festival
     */
    public Festival getFestival() {
        return festival;
    }

    /**
     * Sets the place of festival run
     * @param place String
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Sets the start date of the festival
     * @param date
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * Sets the festival reference once
     * @param festival
     */
    public void setFestival(Festival festival) {
        if (this.festival != null){
            this.festival = festival;
        }
    }

    /**
     * Gets the total duration of the events
     * @return Duration
     */
    public Duration getDuration(){
        Duration myDuration = Duration.ZERO;
        for (Event event :
                this.events) {
            myDuration = myDuration.plus(event.getDuration());
        }
        return myDuration;
    }
}

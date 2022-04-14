import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Class that holds data about a specific festival
 */
public class Festival {

    private String name;
    private ArrayList<FestivalRun> festivalRuns;

    /**
     * Constructor
     * @param name String name of the festival
     */
    public Festival(String name) {
        this.name = name;
        this.festivalRuns = new ArrayList<>();
    }

    /**
     * Gets the name of the festival
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a list of festival runs, (each instance of occurrence of the festival)
     * @return ArrayList of festival runs
     */
    public ArrayList<FestivalRun> getFestivalRuns() {
        return this.festivalRuns;
    }

    /**
     * Sets the name of the festival
     * @param name String new name of the festival
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Adds a new festival run of this festival type
     * @param place Place of the festival
     * @param date start date of the festival
     * @param durationDays duration in days of the festival
     */
    public void addFestivalRun(String place, LocalDateTime date, int durationDays){
        this.festivalRuns.add(new FestivalRun(place, date, durationDays, this));
    }
}

import java.util.ArrayList;

public class Festival {

    private String name;
    private ArrayList<FestivalRun> festivalRuns;


    public Festival(String name) {
        this.name = name;
        this.festivalRuns = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<FestivalRun> getFestivalRuns() {
        return festivalRuns;
    }

    public void setName(String name) {
        this.name = name;
    }
}

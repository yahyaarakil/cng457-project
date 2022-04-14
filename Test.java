import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// LocalDateTime.parse("yyyy-MM-dd HH:mm");
public class Test {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Creating Festivals
        ArrayList<Festival> festivals = new ArrayList<>();
        festivals.add(new Festival("Guzelyurt Orange Festival"));
        festivals.add(new Festival("Tepebasi Tulip Festival"));

        // Creating Festival Runs
        festivals.get(0).addFestivalRun("Guzelyurt", LocalDateTime.parse("2019-06-25 00:00", formatter), 15);
        festivals.get(1).addFestivalRun("Tepbasi", LocalDateTime.parse("2019-03-24 00:00", formatter), 5);
        
        // Creating Organizers
        festivals.get(0).getFestivalRuns().get(0).addOrganizer(new Organizer("Mete", "Kaan"));
        festivals.get(0).getFestivalRuns().get(0).addOrganizer(new Organizer("Sezin", "Seven"));

        festivals.get(1).getFestivalRuns().get(0).addOrganizer(new Organizer("Kenan", "Soylu"));
        festivals.get(1).getFestivalRuns().get(0).addOrganizer(new Organizer("Selma", "Yarin"));

        // Creating Performers
        ArrayList<Performer> performers = new ArrayList<>();
        performers.add(new Performer("Murat", "Boz"));
        performers.add(new Performer("Ali", "Hakan"));
        performers.add(new Performer("Ferda", "Say"));
        performers.add(new Performer("Hale", "Anil"));
        performers.add(new Performer("Ahmed", "Yilmaz"));
        performers.add(new Performer("Fikri", "Karayel"));

        // Creating Events
        festivals.get(0).getFestivalRuns().get(0).addEvent(
                new Concert(
                        "Opening Concert",
                        "Kick off with a popular pop singer",
                        LocalDateTime.parse("2019-06-25 22:00", formatter),
                        LocalDateTime.parse("2019-06-26 00:00", formatter),
                        performers.get(0)
                )
        );
        festivals.get(0).getFestivalRuns().get(0).addEvent(
                new Show(
                        "Folk Dancing Show",
                        "Popular folk dancers in Güzelyurt",
                        LocalDateTime.parse("2019-06-26 20:00", formatter),
                        LocalDateTime.parse("2019-06-26 21:00", formatter)
                )
        );
        ((Show)festivals.get(0).getFestivalRuns().get(0).getEvents().get(1)).addPerformer(performers.get(1));
        ((Show)festivals.get(0).getFestivalRuns().get(0).getEvents().get(1)).addPerformer(performers.get(2));
        ((Show)festivals.get(0).getFestivalRuns().get(0).getEvents().get(1)).addPerformer(performers.get(3));
        ((Show)festivals.get(0).getFestivalRuns().get(0).getEvents().get(1)).addPerformer(performers.get(4));


        festivals.get(1).getFestivalRuns().get(0).addEvent(
                new OtherActivity(
                        "Walking to see Tulips",
                        "2-hours walk as a group",
                        LocalDateTime.parse("2019-03-24 10:00", formatter),
                        LocalDateTime.parse("2019-03-24 12:00", formatter)
                )
        );


        festivals.get(1).getFestivalRuns().get(0).addEvent(
                new Concert(
                        "Opening Concert",
                        "A Concert by a national singer",
                        LocalDateTime.parse("2019-03-24 10:00", formatter),
                        LocalDateTime.parse("2019-03-24 12:00", formatter),
                        performers.get(5)
                )
        );

        // Instantiating strategies
        ArrayList<EventDetailsStrategy> strategies = new ArrayList<>();
        strategies.add(new Version1EventDetails());
        strategies.add(new Version2EventDetails());
        strategies.add(new Version3EventDetails());

        while(true){
            System.out.println("Please Enter details depth (1-3)");
            Scanner inputScanner = new Scanner(System.in);
            int strategyIndex = inputScanner.nextInt();
            strategyIndex -= 1;

            for (Festival festival :
                    festivals) {
                for (FestivalRun festivalRun :
                        festival.getFestivalRuns()) {
                    System.out.println(festivalRun.generateProgram(strategies.get(strategyIndex)));
                }
            }
        }
    }
}

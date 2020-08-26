import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCalendar {

    private FileWriter myFile = new FileWriter("currentdate");
    private String[] months = {"Harnen", "Chay", "Anderik", "Miretorn", "Elarin", "Trakerule",
            "Mareasis", "Ulntar", "Krythrin", "Niilhin", "Eas", "Faldient"};

    private final int endOfMonth = 30;
    private int currentDay = 0;
    private int currentMonth = 0;
    private int currentYear = 0;

    public CreateCalendar(int setDay, int setMonth) throws IOException {
        currentDay =  setDay;
        currentMonth = setMonth;
    }

    public CreateCalendar() throws IOException {
        File file = new File("C:\\Users\\erike\\IdeaProjects\\DNDCalendarTracker\\DNDCalendarTracker\\currentdate.txt");
        try {
            String line0 = Files.readAllLines(Paths.get("currentdate.txt")).get(0);
            currentMonth = Integer.parseInt(line0);
            String line1 = Files.readAllLines(Paths.get("currentdate.txt")).get(1);
            currentDay = Integer.parseInt(line1);
            String line2 = Files.readAllLines(Paths.get("currentdate.txt")).get(2);
            currentYear = Integer.parseInt(line2);

        } catch (IOException e){
            System.out.println(e);
        }
    }

    public String[] getMonths(){
        return months;
    }

    public int getEndOfMonth(){
        return endOfMonth;
    }

    public int getCurrentDay(){
        return this.currentDay;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    public int getCurrentMonth(){
        return this.currentMonth;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public String getMonthName(int current){
        return months[currentMonth];
    }
    
    public int getCurrentYear(){
        return this.currentYear;
    }

    public void setCurrentYear(int newYear){
        this.currentYear = newYear;
    }

}

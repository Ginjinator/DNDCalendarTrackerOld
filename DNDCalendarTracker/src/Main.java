
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            CreateCalendar calendar = new CreateCalendar();
            Scanner kb = new Scanner(System.in);
            int originalDay = calendar.getCurrentDay();
            int daysPassed;

            System.out.println("Current date: " + calendar.getMonthName(calendar.getCurrentMonth()) + "/"
                + calendar.getCurrentDay() + "/" + calendar.getCurrentYear());
            System.out.println("How many days passed this session?: ");
            daysPassed = kb.nextInt();
            calendar.setCurrentDay(calendar.getCurrentDay() + daysPassed);

            //test to see if month ended
            if (calendar.getCurrentDay() > calendar.getEndOfMonth()) {
                int newDaysPassed = daysPassed % calendar.getEndOfMonth();
                calendar.setCurrentDay(originalDay + newDaysPassed);
                int monthsPassed = (daysPassed - newDaysPassed) / calendar.getEndOfMonth();
                //test to see if year ended
                if (monthsPassed == 12) {
                    calendar.setCurrentYear(calendar.getCurrentYear() + 1);
                    calendar.setCurrentMonth(calendar.getCurrentMonth());
                } else if (monthsPassed > 12) {
                    calendar.setCurrentYear(calendar.getCurrentYear() + (monthsPassed / 12));
                    calendar.setCurrentMonth(calendar.getCurrentMonth() + (monthsPassed % 12));
                } else {
                    calendar.setCurrentMonth(calendar.getCurrentMonth() + monthsPassed);
                }
            }

            System.out.println("New date: " + calendar.getMonthName(calendar.getCurrentMonth()) + "/"
                + calendar.getCurrentDay() + "/" + calendar.getCurrentYear());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        CreateCalendar calendar = new CreateCalendar();
        Scanner kb = new Scanner(System.in);
        int originalDay = calendar.getCurrentDay();
        int daysPassed;

        System.out.println("Current date: " + calendar.getMonthName(calendar.getCurrentMonth()) + "/"
                                            + calendar.getCurrentDay());
        System.out.println("How many days passed this session?: ");
        daysPassed = kb.nextInt();
        calendar.setCurrentDay(calendar.getCurrentDay() + daysPassed);

        //test to see if month ended
        if (calendar.getCurrentDay() > calendar.getEndOfMonth()){
            int newDaysPassed = daysPassed % calendar.getEndOfMonth();
            calendar.setCurrentDay(originalDay + newDaysPassed);
            int monthsPassed = (daysPassed - newDaysPassed)/calendar.getEndOfMonth();
            calendar.setCurrentMonth(calendar.getCurrentMonth() + monthsPassed);
        }

        System.out.println("New date: " + calendar.getMonthName(calendar.getCurrentMonth()) + "/"
                                        + calendar.getCurrentDay());
    }
}

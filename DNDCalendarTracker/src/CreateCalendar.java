public class CreateCalendar {

    private String[] months = {"Harnen", "Chay", "Anderik", "Miretorn", "Elarin", "Trakerule",
            "Mareasis", "Ulntar", "Krythrin", "Niilhin", "Eas", "Faldient"};

    private final int endOfMonth = 30;
    private int currentDay = 0;
    private int currentMonth = 0;
    private int currentYear = 749;

    public CreateCalendar() {
        currentDay = 1;
        currentMonth = 0;
    }

    public CreateCalendar(int setDay, int setMonth){
        currentDay =  setDay;
        currentMonth = setMonth;
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

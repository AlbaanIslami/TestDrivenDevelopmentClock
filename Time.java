/**
 * Alban Islami
 */

public class Time
{
    private int theHour = 0;
    private int theMinute = 0;
    private int theSecond = 0;

    protected String timeSet(int hour, int minute, int second)
    {
        if (hour > 23) {
            return "Can not set time. Hours is too high";
        }
        if (hour < 0) {
            return "Can not set time. Hours is too low";
        }
        if(minute > 59){
            return "Can not set time. Minutes is too high";
        }
        if (minute < 0) {
            return "Can not set time. Minutes is too low";
        }
        if (second > 59) {
            return "Can not set time. Seconds is too high";
        }
        if (second < 0) {
            return "Can not set time. Seconds is too low";
        }
        this.theHour = hour;
        this.theMinute = minute;
        this.theSecond = second;

        return showTime();
    }

    protected String showTime()
    {
        String timeShown = "";
        timeShown += (theHour + ": ");
        timeShown += (theMinute + ": ");
        timeShown += (theSecond);

        return timeShown;
    }
}

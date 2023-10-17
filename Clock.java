/**
 * Alban Islami
 */
public class Clock
{
    private Time theTime = new Time();
    private Date theDate = new Date();


    enum currentState
    {
        changeTime, changeDate, displayDate, displayTime
    }

    private currentState State = currentState.displayTime;

    public String changeMode()
    {
        switch (State)
        {
            case displayTime:
                State = State.displayDate;
                return theTime.showTime();

            case displayDate:
                State = State.displayTime;
                return theDate.showDate();

            case changeDate:
                return "Can not change mode, Give me a date to set";

            case changeTime:
                return "Can not change mode, Give me a time to set";
            default: return null;
        }
    }

    public String ready()
    {
        switch (State)
        {
            case displayTime:
                State = State.changeTime;
                return "Set the time as of now!";

            case displayDate:
                State = State.changeDate;
                return "Set the date as of now!";

            case changeDate:
                return "Can not be ready. Set the date";

            case changeTime:
                return "Can not be ready. Set the time";

            default:
                return null;
        }
    }

    public String set(int p1, int p2, int p3)
    {
        switch (State)
        {
            case displayTime:
                return "Time could not be set";

            case displayDate:

                return "Date could not be set";

            case changeDate:
                State = State.changeDate;
                return theDate.dateSet(p1, p2, p3);

            case changeTime:
                State = State.changeTime;
                return theTime.timeSet(p1, p2, p3);
            default:
                return null;
        }
    }




}

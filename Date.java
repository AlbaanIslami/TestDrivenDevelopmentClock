/**
 * Alban Islami
 */
public class Date
{
    private int theYear = 2000;
    private int theMonth = 1;
    private int theDay = 1;


    protected String dateSet(int year, int month, int day)
    {
        if (year < 2000 ) {
            return "Can not set date. Year is too low";
        }
        if (year > 2100){
            return "Can not set date. Year is too high";
        }
        if (month < 1){
            return "Can not set date. Month is too low";
        }
        if (month > 12){
            return "Can not set date. Month is too high";
        }
        if (day < 1){
            return "Can not set date. Day is too low";
        }
        if (day > 31){
            return "Can not set date. Day is too high";
        }
            this.theYear = year;
            this.theMonth = month;
            this.theDay = day;
            return showDate();
    }



    protected String showDate()
    {
        String dateShown = "";
        dateShown += (theYear + " / ");
        dateShown += (theMonth + " / ");
        dateShown += (theDay);

        return dateShown;
    }
}

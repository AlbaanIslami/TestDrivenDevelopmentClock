/**
 * Alban Islami
 */
import static org.junit.jupiter.api.Assertions.*;

class ClockTest
{
    Clock clock = null;
    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        clock = new Clock();
    }

    @org.junit.jupiter.api.Test
    void changeModeTest()
    {
        assertEquals("0: 0: 0", clock.changeMode());
    }

    @org.junit.jupiter.api.Test
    void changemodeTest1()
    {
        clock.changeMode();
        assertEquals("2000 / 1 / 1", clock.changeMode());
    }

    @org.junit.jupiter.api.Test
    void readys1()
    {
        assertEquals("Set the time as of now!", clock.ready());
    }

    @org.junit.jupiter.api.Test
    void readys2()
    {
        clock.changeMode();
        assertEquals("Set the date as of now!", clock.ready());
    }

    @org.junit.jupiter.api.Test
    void sets1()
    {
        clock.ready();
        assertEquals("11: 24: 0",clock.set(11,24,00));
    }

    @org.junit.jupiter.api.Test
    void sets2()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2030 / 1 / 1",clock.set(2030,1,1));
    }
//ILLEGAL

    @org.junit.jupiter.api.Test
    void S1SetTime()
    {
        assertEquals("Time could not be set", clock.set(00,00,00));
    }

    @org.junit.jupiter.api.Test
    void S2SetDate()
    {
        clock.changeMode();
        assertEquals("Date could not be set", clock.set(00,00,0000));
    }

    @org.junit.jupiter.api.Test
    void S3ChangeMode()
    {
        clock.ready();
        assertEquals("Can not change mode, Give me a time to set", clock.changeMode());
    }

    @org.junit.jupiter.api.Test
    void S3Ready()
    {
        clock.ready();
        assertEquals("Can not be ready. Set the time", clock.ready());
    }
    @org.junit.jupiter.api.Test
    void S4ChangeMode()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not change mode, Give me a date to set", clock.changeMode());
    }

    @org.junit.jupiter.api.Test
    void S4Ready()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not be ready. Set the date", clock.ready());
    }
//ILLEGAL END

    @org.junit.jupiter.api.Test
    void setTimeHourLowerInvalidBoundary()
    {
        clock.ready();
        assertEquals("Can not set time. Hours is too low", clock.set(-1,0,0));

    }

    @org.junit.jupiter.api.Test
    void setTimeHourLowerValidBoundary()
    {
        clock.ready();
        assertEquals("0: 0: 0", clock.set(00,00,00));
    }
    @org.junit.jupiter.api.Test
    void setTimeHourHighValidBoundary()
    {
        clock.ready();
        assertEquals("23: 0: 0", clock.set(23,00,00));
    }

    @org.junit.jupiter.api.Test
    void setTimeHourHighInvalidBoundary()
    {
        clock.ready();
        assertEquals("Can not set time. Hours is too high", clock.set(24,00,00));
    }

    @org.junit.jupiter.api.Test
    void setTimeMinuteLowerInvalidBoundary()
    {
        clock.ready();
        assertEquals("Can not set time. Minutes is too low", clock.set(0,-1,0));

    }

    @org.junit.jupiter.api.Test
    void setTimeMinuteLowerValidBoundary()
    {
        clock.ready();
        assertEquals("0: 0: 0", clock.set(0,0,0));
    }
    @org.junit.jupiter.api.Test
    void setTimeMinuteHighValidBoundary()
    {
        clock.ready();
        assertEquals("0: 58: 0", clock.set(0,58,0));
    }

    @org.junit.jupiter.api.Test
    void setTimeMinuteHighInvalidBoundary()
    {
        clock.ready();
        assertEquals("Can not set time. Minutes is too high", clock.set(00,60,00));
    }

    @org.junit.jupiter.api.Test
    void setTimeSecondLowerInvalidBoundary()
    {
        clock.ready();
        assertEquals("Can not set time. Seconds is too low", clock.set(00,00,-1));

    }

    @org.junit.jupiter.api.Test
    void setTimeSecondLowerValidBoundary()
    {
        clock.ready();
        assertEquals("0: 0: 0", clock.set(00,00,00));
    }
    @org.junit.jupiter.api.Test
    void setTimeSecondHighValidBoundary()
    {
        clock.ready();
        assertEquals("0: 0: 58", clock.set(00,00,58));
    }

    @org.junit.jupiter.api.Test
    void setTimeSecondHighInvalidBoundary()
    {
        clock.ready();
        assertEquals("Can not set time. Seconds is too high", clock.set(00,00,60));
    }

    @org.junit.jupiter.api.Test
    void setDateDayLowInvalidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not set date. Day is too low", clock.set(2000,1,0));
    }

    @org.junit.jupiter.api.Test
    void setDateDayLowValidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2000 / 1 / 1", clock.set(2000,1,1));
    }

    @org.junit.jupiter.api.Test
    void setDateDayHighValidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2000 / 1 / 30", clock.set(2000,1,30));
    }

    @org.junit.jupiter.api.Test
    void setDateMonthHighInvalidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not set date. Month is too high", clock.set(2000,13,1));
    }

    @org.junit.jupiter.api.Test
    void setDateMonthLowInvalidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not set date. Month is too low", clock.set(2000,0,1));
    }

    @org.junit.jupiter.api.Test
    void setDateMonthLowValidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2000 / 2 / 1", clock.set(2000,2,1));
    }

    @org.junit.jupiter.api.Test
    void setDateMonthHighValidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2000 / 11 / 1", clock.set(2000,11,1));
    }

    @org.junit.jupiter.api.Test
    void setDateDayHighInvalidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not set date. Day is too high", clock.set(2000,1,32));
    }

    @org.junit.jupiter.api.Test
    void setDateYearLowInvalidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not set date. Year is too low", clock.set(1,1,1999));
    }

    @org.junit.jupiter.api.Test
    void setDateYearLowValidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2001 / 2 / 1", clock.set(2001,2,1));
    }

    @org.junit.jupiter.api.Test
    void setDateYearHighValidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("2099 / 12 / 1", clock.set(2099,12,1));
    }

    @org.junit.jupiter.api.Test
    void setDateYearHighInvalidBoundary()
    {
        clock.changeMode();
        clock.ready();
        assertEquals("Can not set date. Year is too high", clock.set(2101,12,1));
    }
}
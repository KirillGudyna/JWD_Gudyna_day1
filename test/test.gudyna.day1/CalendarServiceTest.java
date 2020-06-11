package test.gudyna.day1;

import com.gudyna.day1.entity.UserTime;
import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.CalendarService;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CalendarServiceTest {
    private CalendarService calendarService = new CalendarService();

    @Test
    public void testLeapYear() {
        int year = 2000;
        try {
            boolean actual = calendarService.isLeapYear(year);
            assertTrue(actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test1LeapYear() {
        int year = 2001;
        try {
            boolean actual = calendarService.isLeapYear(year);
            assertFalse(actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testTheNumberOfDays() {
        int year = 2000;
        int month = 2;
        int expected = 29;
        try {
            int actual = calendarService.determineTheNumberOfDays(year, month);
            assertEquals(expected, actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testHoursMinutesSeconds() {
        int totalSecond = 3662;
        UserTime expected = new UserTime(1, 1, 2);
        try {
            UserTime actual = calendarService.calculateHoursMinutesSeconds(totalSecond);
            assertEquals(expected, actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }
}

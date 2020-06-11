package com.gudyna.day1.service;

import com.gudyna.day1.entity.UserTime;
import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.validator.DateTimeValidator;

import java.time.YearMonth;
import java.util.GregorianCalendar;

public class CalendarService {
    private static final int SEC_IN_MINUTE=60;
    private static final int MINUTE_IN_HOUR=60;
    public boolean isLeapYear(int year) throws TaskException {
        DateTimeValidator dateTimeValidator = new DateTimeValidator();
        if(dateTimeValidator.isYearValidate(year)){
            throw new TaskException("Year must be in range (200,4000)");
        }
        GregorianCalendar userCalendar = new GregorianCalendar();
        return userCalendar.isLeapYear(year);
    }
    public int determineTheNumberOfDays(int year, int month) throws TaskException {
        DateTimeValidator dateTimeValidator = new DateTimeValidator();
        if(dateTimeValidator.isYearValidate(year) || !dateTimeValidator.isMonthValidate(month)){
            throw new TaskException("Year must be in range (200,4000) and month must be in range(0,12)");
        }
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }
    public UserTime calculateHoursMinutesSeconds(int totalSeconds) throws TaskException {
        DateTimeValidator dateTimeValidator = new DateTimeValidator();
        if(!dateTimeValidator.isSecondsValidate(totalSeconds)){
            throw new TaskException("Second must be < 86400");
        }
        int hours = totalSeconds / (SEC_IN_MINUTE*MINUTE_IN_HOUR);
        int minutes = (totalSeconds-hours * (SEC_IN_MINUTE*MINUTE_IN_HOUR)) / SEC_IN_MINUTE;
        int seconds = (totalSeconds-hours * (SEC_IN_MINUTE*MINUTE_IN_HOUR)) % SEC_IN_MINUTE;
        return new UserTime(hours,minutes,seconds);

    }
}

package com.gudyna.day1.validator;

public class DateTimeValidator {
    private static final int CALENDAR_BEGINNING = 200;
    private static final int CALENDAR_END = 4000;
    private static final int MONTH_IN_YEAR = 12;
    private static final int SECONDS_IN_DAY = 86400;

    public boolean isYearValidate(int year) {
        return (year < CALENDAR_BEGINNING || year > CALENDAR_END);
    }

    public boolean isMonthValidate(int month) {
        return month <= MONTH_IN_YEAR;
    }

    public boolean isSecondsValidate(int seconds){
        return seconds <= SECONDS_IN_DAY;
    }
}

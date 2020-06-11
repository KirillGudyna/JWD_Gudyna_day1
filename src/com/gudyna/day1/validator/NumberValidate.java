package com.gudyna.day1.validator;

public class NumberValidate {
    private static final int START_VALUE = -155;
    private static final int END_VALUE = 155;

    public boolean isNumberValidate(int number) {
        return (number < START_VALUE || number > END_VALUE);
    }
    public boolean isNumberValidate(double number) {
        return (number < START_VALUE || number > END_VALUE);
    }
}

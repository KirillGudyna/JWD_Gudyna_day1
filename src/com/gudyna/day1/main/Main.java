package com.gudyna.day1.main;

import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.CalendarService;
import com.gudyna.day1.service.ShapeService;
import com.gudyna.day1.validator.NumberValidate;

public class Main {
    public static void main(String[] args) throws TaskException {
        CalendarService calendarService=new CalendarService();
        ShapeService shapeService = new ShapeService();
        shapeService.calculateAreaCircle(-4);
        NumberValidate numberValidate = new NumberValidate();
        System.out.println(numberValidate.isNumberValidate(5));
    }
}

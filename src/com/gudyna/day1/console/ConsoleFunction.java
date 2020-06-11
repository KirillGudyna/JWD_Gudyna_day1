package com.gudyna.day1.console;

import com.gudyna.day1.entity.UserPoint;
import com.gudyna.day1.entity.UserTime;
import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.CalendarService;

import java.util.Map;

public class ConsoleFunction {

    public void printTheLastDigitOfTheSquareOfNumber(int digit) {
        System.out.println(digit);
    }

    //Function print information about year and month
    public void printData(int year, int month) throws TaskException {
        CalendarService calendarService = new CalendarService();
        System.out.println("The number of days of month:" + calendarService.determineTheNumberOfDays(year, month));
        if (calendarService.isLeapYear(year)) {
            System.out.println("Year is Leap!");
        } else {
            System.out.println("Year is no Leap!");
        }
    }

    public void printInformationAboutSquare(double attitudeAreasOfDescribedAndInscribedSquare, double areaOfInscribedSquare) {
        System.out.println("Area of inscribed square:" + areaOfInscribedSquare);
        System.out.println("Attitude areas Of described and inscribed square: " + attitudeAreasOfDescribedAndInscribedSquare);
    }

    //Function print value of "among the given integers A, B, C, D there are at least two even"
    public void printAnswer(boolean answer) {
        System.out.println("value of \"among the given integers A, B, C, D there are at least two even\":" + answer);
    }

    public void printInfoAboutEvenNumber(int number, boolean answer) {
        if (answer) {
            System.out.println("Number:{" + number + "}" + "is perfect");
        } else {
            System.out.println("Number:{" + number + "}" + "is not perfect");
        }
    }

    public void printHoursMinutesSeconds(UserTime userTime) {
        System.out.println(userTime.toString());
    }

    //This Function print which point closer to the origin
    public void printAnswer(UserPoint userPoint) {
        //distance to the origin of point A1
        System.out.println(userPoint.toString() + "is closer to zero!");
    }

    public void printFunctionValue(double value) {
        System.out.println("Value of our custom function: " + value);
    }

    public void printAreaAndCircumference(double area, double circumference) {
        System.out.println("Area Of Circle=" + area);
        System.out.println("Circumference=" + circumference);
    }
    public void printValueFunctionOfRangeWithStep(Map<Double,Double> result){
        for (Map.Entry<Double,Double> item : result.entrySet()) {
            System.out.printf(" |%.2f| %.2f \n", item.getKey(), item.getValue());
        }
    }

}

package com.gudyna.day1.service;

import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.validator.NumberValidate;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticService {
    public double arithmeticFunctionWithTwoBranches(double x) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(numberValidate.isNumberValidate(x)){
            throw new TaskException("Number must be in range -155 and 155");
        }
        if (x >= 3) {
            return -Math.pow(x, 2) + 3 * x + 9;
        } else {
            return 1.0 / (Math.pow(x, 3) - 6);
        }
    }

    public double customFunction(double x) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(numberValidate.isNumberValidate(x)){
            throw new TaskException("Argument must be in range -155 and 155");
        }
        return Math.tan(x);
    }

    public double[] makeArrayOfArgumentsWithStep(int startSegmentValues, int endSegmentValues, double step) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(numberValidate.isNumberValidate(startSegmentValues) || numberValidate.isNumberValidate(endSegmentValues)){
            throw new TaskException("Start and end segment values must be in range -155 and 155");
        }
        int amountOfArguments = (int) ((startSegmentValues + endSegmentValues) / step);
        amountOfArguments++;
        double[] arrayOfArgumentsWithStep = new double[amountOfArguments];
        for (int i = 0; i < amountOfArguments; i++) {
            arrayOfArgumentsWithStep[i] = startSegmentValues + i * step;
        }
        return arrayOfArgumentsWithStep;
    }

    public Map<Double, Double> makeArrayValuesFunctionOnSegmentWithStep(double[] arrayOfArgumentsWithStep) throws TaskException {
        int amountOfValues = arrayOfArgumentsWithStep.length;
        Map<Double,Double> resultTable = new HashMap<>();
        double[] arrayOfValuesOnSegmentWithStep=new double[amountOfValues];
        for (int i = 0; i < amountOfValues; i++) {
            arrayOfValuesOnSegmentWithStep[i]=customFunction(arrayOfArgumentsWithStep[i]);
            resultTable.put(arrayOfArgumentsWithStep[i],arrayOfValuesOnSegmentWithStep[i]);
        }
        return resultTable;
    }
}

package com.gudyna.day1.service;

import com.gudyna.day1.exception.TaskException;

public class ShapeService {
    public double calculateAreaOfInscribedSquare(double areaOfDescribedSquare) throws TaskException {
        if(areaOfDescribedSquare<0){
            throw new TaskException("Area must be > 0!!!");
        }
        double sideOfDescribedSquare = Math.sqrt(areaOfDescribedSquare);
        double areaOfInscribedSquare;
        areaOfInscribedSquare = Math.pow(sideOfDescribedSquare, 2) / 2;
        return areaOfInscribedSquare;
    }

    public double calculateAttitudeAreasOfDescribedAndInscribedSquare(double areaDescribedSquare, double areaInscribedSquare) {
        return Math.round(areaDescribedSquare / areaInscribedSquare);
    }

    public double calculateCircumference(double radius) throws TaskException {
        if(radius<0){
            throw new TaskException("Radius must be > 0!!!");
        }
        return 2 * Math.PI * radius;
    }

    public double calculateAreaCircle(double radius) throws TaskException {
        if(radius<0){
            throw new TaskException("Radius must be > 0!!!");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}

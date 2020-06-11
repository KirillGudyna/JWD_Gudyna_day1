package com.gudyna.day1.service;

import com.gudyna.day1.entity.UserPoint;
import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.validator.PointValidator;

public class PointService {
    public UserPoint defineCloserPoint(UserPoint pointA1, UserPoint pointA2) throws TaskException {
        PointValidator pointValidator = new PointValidator();
        if(pointValidator.isPointValidate(pointA1) || pointValidator.isPointValidate(pointA2)){
            throw new TaskException("Coordinates are not in range (0, 100)");
        }
        double distanceFromA1 = Math.hypot(pointA1.getX(), pointA1.getY());
        double distanceFromA2 = Math.hypot(pointA2.getX(), pointA2.getY());
        if (distanceFromA1 > distanceFromA2) {
            return pointA2;
        } else {
            return pointA1;
        }
    }
}

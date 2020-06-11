package com.gudyna.day1.validator;

import com.gudyna.day1.entity.UserPoint;

public class PointValidator {
    private static final int START = 0;
    private static final int END = 100;

    public boolean isPointValidate(UserPoint userPoint) {
        return (userPoint.getX() < START || userPoint.getX() > END || userPoint.getY() < START || userPoint.getY() > END);
    }

}

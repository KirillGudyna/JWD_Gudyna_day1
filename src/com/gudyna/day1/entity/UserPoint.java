package com.gudyna.day1.entity;

import java.util.Objects;

public class UserPoint {
    private final double x;
    private final double y;
    private final String name;

    public UserPoint(double x, double y) {
        this.x = x;
        this.y = y;
        this.name = "";
    }

    public UserPoint(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserPoint)) return false;
        UserPoint userPoint = (UserPoint) o;
        return Double.compare(userPoint.getX(), getX()) == 0 &&
                Double.compare(userPoint.getY(), getY()) == 0 &&
                getName().equals(userPoint.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getName());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name='");
        stringBuilder.append(name);
        stringBuilder.append(", x=");
        stringBuilder.append(x);
        stringBuilder.append(", y=");
        stringBuilder.append(y);
        return stringBuilder.toString();
    }
}

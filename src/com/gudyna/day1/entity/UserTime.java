package com.gudyna.day1.entity;

import java.util.Objects;

public class UserTime {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public UserTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserTime)) return false;
        UserTime userTime = (UserTime) o;
        return getHours() == userTime.getHours() &&
                getMinutes() == userTime.getMinutes() &&
                getSeconds() == userTime.getSeconds();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHours(), getMinutes(), getSeconds());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hours=");
        stringBuilder.append(hours);
        stringBuilder.append(", minutes=" );
        stringBuilder.append(minutes);
        stringBuilder.append(", seconds=");
        stringBuilder.append(seconds);
        return stringBuilder.toString();
    }
}

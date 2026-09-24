package main.enums;

public enum TemperatureUnit {
    C,
    F,
    K;

    public double toCelsiusUnit(double value) {
        return switch (this) {
            case C -> value;
            case F -> (value - 32) * 5.0 / 9.0;
            case K -> value - 273.15;
        };
    }

    public double fromCelsiusUnit(double value) {
        return switch (this) {
            case C -> value;
            case F -> (value * 9.0 / 5.0) + 32;
            case K -> value + 273.15;
        };
    }
}
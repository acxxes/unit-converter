package main.enums;

public enum TemperatureUnit {
    C(1.0, 0.0),      // BaseUnit
    F(5.0 / 9.0, -32 * (5.0 / 9.0)),
    K(1.0, -273.15);

    private final double scale;
    private final double offset;

    TemperatureUnit(double scale, double offset) {
        this.scale = scale;
        this.offset = offset;
    }

    public double toCelsiusUnit(double value) {
        return (value + offset) * scale;
    }

    public double fromCelsiusUnit(double value) {
        return (value / scale) - offset;
    }
}
package main.enums;

public enum LengthUnit {
    MM(0.001),
    CM(0.01),
    M(1.0), // BaseUnit
    KM(1000.0),
    IN(0.0254),
    YD(0.9144),
    FT(0.3048),
    MI(1609.34);

    private final double unit;

    LengthUnit(double unit) {
        this.unit = unit;
    }

    public double toMeterUnit(double value) {
        return value * unit;
    }

    public double fromMeterUnit(double value) {
        return value / unit;
    }
}

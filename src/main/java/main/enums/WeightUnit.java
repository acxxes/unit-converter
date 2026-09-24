package main.enums;

public enum WeightUnit {
    MG(0.000001),
    G(0.001),
    KG(1.0), // BaseUnit
    OZ(0.0283495),
    LB(0.453592),
    ST(6.35029),
    T(1000.0);

    private final double unit;

    WeightUnit(double unit) {
        this.unit = unit;
    }

    public double toKilogramUnit(double value) {
        return value * unit;
    }

    public double fromKilogramUnit(double value) {
        return value / unit;
    }
}
package main.service;

import main.enums.WeightUnit;

public class WeightConverter implements StrategyConverter {

    @Override
    public double convert(double value, String unitFrom, String unitTo) {
        double calculatedToBaseUnit = WeightUnit.valueOf(unitFrom).toKilogramUnit(value);
        return WeightUnit.valueOf(unitTo).fromKilogramUnit(calculatedToBaseUnit);
    }
}

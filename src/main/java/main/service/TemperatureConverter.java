package main.service;

import main.enums.TemperatureUnit;

public class TemperatureConverter implements StrategyConverter {

    @Override
    public double convert(double value, String unitFrom, String unitTo) {
        double calculatedToBaseUnit = TemperatureUnit.valueOf(unitFrom).toCelsiusUnit(value);
        return TemperatureUnit.valueOf(unitTo).fromCelsiusUnit(calculatedToBaseUnit);
    }
}

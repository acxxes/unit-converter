package com.github.acxxes.unitconverter.service;

import com.github.acxxes.unitconverter.enums.TemperatureUnit;

public class TemperatureConverter implements StrategyConverter {

    @Override
    public double convert(double value, String unitFrom, String unitTo) {
        double calculatedToBaseUnit = TemperatureUnit.valueOf(unitFrom).toCelsiusUnit(value);
        return TemperatureUnit.valueOf(unitTo).fromCelsiusUnit(calculatedToBaseUnit);
    }
}

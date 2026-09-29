package com.github.acxxes.unitconverter.service;

import com.github.acxxes.unitconverter.enums.LengthUnit;

public class LengthConverter implements StrategyConverter{

    @Override
    public double convert(double value, String unitFrom, String unitTo) {
        double calculatedToBaseUnit = LengthUnit.valueOf(unitFrom).toMeterUnit(value);
        return LengthUnit.valueOf(unitTo).fromMeterUnit(calculatedToBaseUnit);
    }
}

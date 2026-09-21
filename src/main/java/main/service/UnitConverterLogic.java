package main.service;

import main.pojo.UnitConverter;

public class UnitConverterLogic {

    public static double convert(UnitConverter unitConverter) {
        double result = 0;

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
        // TEMPERATURE
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
        switch (unitConverter.getUnitFrom()) {
            case "mm":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                    case "cm":
                        result = unitConverter.getLength() / 10;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        result = unitConverter.getLength() / 1_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() / 25.4;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() / 304.8;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        result = unitConverter.getLength() / 914.4;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        result = unitConverter.getLength() / 1_690_344;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "cm":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 10;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 100;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        result = unitConverter.getLength() / 100_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() / 2.54;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() / 30.48;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        result = unitConverter.getLength() / 91.44;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        result = unitConverter.getLength() / 160_900;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "m":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        result = unitConverter.getLength() * 100;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "km":
                        result = unitConverter.getLength() / 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 39.37;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() * 3.281;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        result = unitConverter.getLength() * 1.094;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        result = unitConverter.getLength() / 1609;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "km":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 1_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        result = unitConverter.getLength() * 100_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() * 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 39_370;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() * 3281;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        result = unitConverter.getLength() * 1094;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        result = unitConverter.getLength() * 0.621371;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "in":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 25.4;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        result = unitConverter.getLength() / 2.54;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 39.37;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        result = unitConverter.getLength() / 39_370;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "ft":
                        result = unitConverter.getLength() / 12;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        result = unitConverter.getLength() / 36;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        result = unitConverter.getLength() / 63_360;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "ft":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 304.8;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        result = unitConverter.getLength() / 30.48;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 3.281;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        result = unitConverter.getLength() / 3281;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 12;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "yd":
                        result = unitConverter.getLength() / 3;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        result = unitConverter.getLength() / 5280;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "yd":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 914.4;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        result = unitConverter.getLength() * 91.44;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 1.094;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        result = unitConverter.getLength() / 1094;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 36;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() * 3;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "mi":
                        result = unitConverter.getLength() / 1760;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "mi":
                switch (unitConverter.getUnitTo()) {
                    case "mm":
                        result = unitConverter.getLength() * 1_609_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "cm":
                        result = unitConverter.getLength() * 160_900;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() * 1609;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "km":
                        result = unitConverter.getLength() * 1.609;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 63_360;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() * 5280;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "yd":
                        result = unitConverter.getLength() * 1760;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "mi":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                }
                break;
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
            // WEIGHT
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
            case "mg":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                    case "g":
                        result = unitConverter.getWeight() / 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "kg":
                        result = unitConverter.getWeight() / 1_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "oz":
                        result = unitConverter.getWeight() / 28_350;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "lb":
                        result = unitConverter.getWeight() / 453_600;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "st":
                        result = unitConverter.getWeight() / 6_350_293.18;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "t":
                        result = unitConverter.getWeight() / 1_000_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "g":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        result = unitConverter.getWeight() * 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "g":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                    case "kg":
                        result = unitConverter.getWeight() / 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "oz":
                        result = unitConverter.getWeight() / 28.35;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "lb":
                        result = unitConverter.getWeight() / 453.59237;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "st":
                        result = unitConverter.getWeight() / 6350;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "t":
                        result = unitConverter.getWeight() / 1_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "kg":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        result = unitConverter.getWeight() * 1_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "g":
                        result = unitConverter.getWeight() * 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "kg":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                    case "oz":
                        result = unitConverter.getWeight() * 35_274;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "lb":
                        result = unitConverter.getWeight() * 2205;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "st":
                        result = unitConverter.getWeight() / 6.35;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "t":
                        result = unitConverter.getWeight() / 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "oz":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        result = unitConverter.getWeight() * 28_350;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "g":
                        result = unitConverter.getWeight() * 28.3495;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "kg":
                        result = unitConverter.getWeight() / 35.274;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "oz":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                    case "lb":
                        result = unitConverter.getWeight() / 16;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "st":
                        result = unitConverter.getWeight() / 224;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "t":
                        result = unitConverter.getWeight() / 35_270;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "lb":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        result = unitConverter.getWeight() * 453_600;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "g":
                        result = unitConverter.getWeight() * 453.59237;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "kg":
                        result = unitConverter.getWeight() / 2.205;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "oz":
                        result = unitConverter.getWeight() * 16;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "lb":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                    case "st":
                        result = unitConverter.getWeight() / 14;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "t":
                        result = unitConverter.getWeight() / 2205;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "st":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        result = unitConverter.getWeight() * 6_350_293.18;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "g":
                        result = unitConverter.getWeight() * 6350;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "kg":
                        result = unitConverter.getWeight() / 6.350;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "oz":
                        result = unitConverter.getWeight() * 224;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "lb":
                        result = unitConverter.getWeight() * 14;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "st":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                    case "t":
                        result = unitConverter.getWeight() / 142.9;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "t":
                switch (unitConverter.getUnitTo()) {
                    case "mg":
                        result = unitConverter.getWeight() * 1_000_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "g":
                        result = unitConverter.getWeight() * 1_000_000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "kg":
                        result = unitConverter.getWeight() * 1000;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "oz":
                        result = unitConverter.getWeight() * 35_270;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "lb":
                        result = unitConverter.getWeight() * 2205;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "st":
                        result = unitConverter.getWeight() * 157.473;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "t":
                        System.out.println(unitConverter.getWeight() + unitConverter.getUnitFrom());
                        break;
                }
                break;
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
            // TEMPERATURE
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
            case "c":
                switch (unitConverter.getUnitTo()) {
                    case "c":
                        System.out.println(unitConverter.getTemperature() + unitConverter.getUnitFrom());
                        break;
                    case "f":
                        result = (unitConverter.getTemperature() * 9 / 5) + 32;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "k":
                        result = unitConverter.getTemperature() + 273.15;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "f":
                switch (unitConverter.getUnitTo()) {
                    case "c":
                        result = (unitConverter.getTemperature() - 32) * 5 / 9;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "f":
                        System.out.println(unitConverter.getTemperature() + unitConverter.getUnitFrom());
                        break;
                    case "k":
                        result = ((unitConverter.getTemperature() - 32) * 5 / 9) + 273.15;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "k":
                switch (unitConverter.getUnitTo()) {
                    case "c":
                        result = unitConverter.getTemperature() - 273.15;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "f":
                        result = ((unitConverter.getTemperature() - 273.15) * 9 / 5) + 32;
                        break;
                    case "k":
                        System.out.println(unitConverter.getTemperature() + unitConverter.getUnitFrom());
                        break;
                }
                break;
        }

        return result;
    }
}

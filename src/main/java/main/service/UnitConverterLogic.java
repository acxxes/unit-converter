package main.service;

import main.pojo.UnitConverter;

public class UnitConverterLogic {

    public static double convert(UnitConverter unitConverter) {
        double result = 0;

        switch (unitConverter.getUnitFrom()) {
            case "cm":
                switch (unitConverter.getUnitTo()) {
                    case "cm":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 100;
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
                }
                break;
            case "m":
                switch (unitConverter.getUnitTo()) {
                    case "cm":
                        result = unitConverter.getLength() * 100;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 39.37;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        result = unitConverter.getLength() * 3.281;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "in":
                switch (unitConverter.getUnitTo()) {
                    case "cm":
                        result = unitConverter.getLength() / 2.54;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 39.37;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                    case "ft":
                        result = unitConverter.getLength() / 12;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                }
                break;
            case "ft":
                switch (unitConverter.getUnitTo()) {
                    case "cm":
                        result = unitConverter.getLength() / 30.48;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "m":
                        result = unitConverter.getLength() / 3.281;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "in":
                        result = unitConverter.getLength() * 12;
                        System.out.println(result + unitConverter.getUnitTo());
                        break;
                    case "ft":
                        System.out.println(unitConverter.getLength() + unitConverter.getUnitFrom());
                        break;
                }
                break;
        }
        return result;
    }
}

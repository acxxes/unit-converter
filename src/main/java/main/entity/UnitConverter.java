package main.entity;

public class UnitConverter {
    private double lengthInput;
    private double weightInput;
    private double temperatureInput;
    private String unitFrom;
    private String unitTo;
    private String category;
    public static double convertedResult;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static double getConvertedResult() {
        return convertedResult;
    }

    public static void setConvertedResult(double convertedResult) {
        UnitConverter.convertedResult = convertedResult;
    }

    public double getLengthInput() {
        return lengthInput;
    }

    public void setLengthInput(double lengthInput) {
        this.lengthInput = lengthInput;
    }

    public double getTemperatureInput() {
        return temperatureInput;
    }

    public void setTemperatureInput(double temperatureInput) {
        this.temperatureInput = temperatureInput;
    }

    public String getUnitFrom() {
        return unitFrom;
    }

    public void setUnitFrom(String unitFrom) {
        this.unitFrom = unitFrom;
    }

    public String getUnitTo() {
        return unitTo;
    }

    public void setUnitTo(String unitTo) {
        this.unitTo = unitTo;
    }

    public double getWeightInput() {
        return weightInput;
    }

    public void setWeightInput(double weightInput) {
        this.weightInput = weightInput;
    }
}

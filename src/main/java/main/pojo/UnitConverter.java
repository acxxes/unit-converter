package main.pojo;

public class UnitConverter {
    private double length;
    private double weight;
    private double temperature;
    private String unitFrom;
    private String unitTo;
    public static double convertedResult;

    public static double getConvertedResult() {
        return convertedResult;
    }

    public static void setConvertedResult(double convertedResult) {
        UnitConverter.convertedResult = convertedResult;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

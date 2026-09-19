package main.pojo;

public class UnitConverter {
    private double length;
    private String unitFrom;
    private String unitTo;
    public static double convertedResult;

    public static void setConvertedResult(double convertedResult) {
        UnitConverter.convertedResult = convertedResult;
    }

    public static double getConvertedResult() {
        return convertedResult;
    }

    public void setUnitFrom(String unitFrom) {
        this.unitFrom = unitFrom;
    }

    public String getUnitFrom() {
        return unitFrom;
    }

    public void setUnitTo(String unitTo) {
        this.unitTo = unitTo;
    }

    public String getUnitTo() {
        return unitTo;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


}

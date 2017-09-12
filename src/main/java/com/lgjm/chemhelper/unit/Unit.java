package com.lgjm.chemhelper.unit;

public interface Unit {

    public String getName();

    public String getSymbol();

    public double toStandard(double start);

    public double fromStandard(double start);

}

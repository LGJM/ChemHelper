package com.wackywozniaks.chemhelper.units;

public interface Unit {

    public String getName();

    public String getSymbol();

    public double toStandard(double start);

    public double fromStandard(double start);

}

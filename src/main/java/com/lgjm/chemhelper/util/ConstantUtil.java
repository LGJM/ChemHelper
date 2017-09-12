package com.lgjm.chemhelper.util;

import com.lgjm.chemhelper.math.Operator;
import com.lgjm.chemhelper.unit.*;

/**
 * Represents constants
 *
 * @author ChemHelper
 * @version 08/11/2017
 */
public enum ConstantUtil {

    ROOM_TEMPERATURE("Room Temperature", "", 293.15, TemperatureUnit.KELVIN),
    STANDARD_TEMPERATURE("Standard Temperature", "", 273.15, TemperatureUnit.KELVIN),
    STANDARD_PRESSURE("Standard Pressure", "", 1, PressureUnit.ATMOSPHERES),
    SPEED_OF_LIGHT("Speed of Light", "c", 299792458, new CompoundUnit(LengthUnit.METER).addStep(Operator.DIV, TimeUnit.SECOND)), //m/s
    PLANCKS_CONSTANT("Planck's Constant", "h", 6.62607E-34, new CompoundUnit(EnergyUnit.JOULE).addStep(Operator.MULT, TimeUnit.SECOND)), //J*s
    IDEAL_GAS_CONSTANT("Ideal Gas Constant", "R", 0.082057, new CompoundUnit(VolumeUnit.LITER).addStep(Operator.MULT, PressureUnit.ATMOSPHERES).addStep(Operator.DIV, AmountUnit.MOLE).addStep(Operator.DIV, TemperatureUnit.KELVIN)); //Liter*atm/(mol*K)

    private String name;
    private String symbol;
    private double value;
    private Unit unit;

    ConstantUtil(String name, String symbol, double value, Unit unit) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

}

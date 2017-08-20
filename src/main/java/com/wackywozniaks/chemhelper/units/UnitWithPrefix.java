package com.wackywozniaks.chemhelper.units;

/**
 * Represents a Unit with a metric prefix.
 *
 * @author ChemHelper
 * @version 08/10/2017
 */
public class UnitWithPrefix implements Unit {

    private MetricPrefix prefix;
    private Unit unit;

    public UnitWithPrefix(Unit unit) {
        this.unit = unit;
        this.prefix = MetricPrefix.BASE;
    }

    public UnitWithPrefix(MetricPrefix prefix, Unit unit) {
        this.prefix = prefix;
        this.unit = unit;
    }

    @Override
    public String getName() {
        return prefix.getName() + unit.getName();
    }

    @Override
    public String getSymbol() {
        return prefix.getSymbol() + unit.getSymbol();
    }

    @Override
    public double toStandard(double start) {
        return unit.toStandard(prefix.toBase(start));
    }

    @Override
    public double fromStandard(double start) {
        return prefix.fromBase(unit.fromStandard(start));
    }

}

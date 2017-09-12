package com.lgjm.chemhelper.unit;

import com.lgjm.chemhelper.math.Expression;

public enum VolumeUnit implements Unit {

    LITER("liter", "L", Expression.NO_EXPRESSION, Expression.NO_EXPRESSION);

    private String name;
    private String symbol;
    private Expression toStandard;
    private Expression fromStandard;

    VolumeUnit(String name, String symbol, Expression toStandard, Expression fromStandard) {
        this.name = name;
        this.symbol = symbol;
        this.toStandard = toStandard;
        this.fromStandard = fromStandard;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public double toStandard(double start) {
        return toStandard.solveExpression(start);
    }

    @Override
    public double fromStandard(double start) {
        return fromStandard.solveExpression(start);
    }

}

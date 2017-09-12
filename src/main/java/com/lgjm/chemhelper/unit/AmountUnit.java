package com.lgjm.chemhelper.unit;

import com.lgjm.chemhelper.math.Expression;

public enum AmountUnit implements Unit {

    MOLE("mole", "mol", Expression.NO_EXPRESSION, Expression.NO_EXPRESSION);

    private String name;
    private String symbol;
    private Expression toStandard;
    private Expression fromStandard;

    AmountUnit(String name, String symbol, Expression toStandard, Expression fromStandard) {
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

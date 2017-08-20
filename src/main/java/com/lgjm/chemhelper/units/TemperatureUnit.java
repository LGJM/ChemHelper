package com.lgjm.chemhelper.units;

import com.lgjm.chemhelper.math.Operator;
import com.lgjm.chemhelper.math.Expression;

public enum TemperatureUnit implements Unit {

    KELVIN("Kelvin", "K", new Expression().addStep(Operator.ADD, 273.15), new Expression().addStep(Operator.SUB, 273.15)),
    CELSIUS("Celsius", "\u2013", Expression.NO_EXPRESSION, Expression.NO_EXPRESSION),
    FAHRENHEIT("Fahrenheit", "\u2109", new Expression().addStep(Operator.SUB, 32).addStep(Operator.DIV, 1.8), new Expression().addStep(Operator.MULT, 1.8).addStep(Operator.ADD, 32));

    private String name;
    private String symbol;
    private Expression toStandard;
    private Expression fromStandard;

    TemperatureUnit(String name, String symbol, Expression toStandard, Expression fromStandard) {
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

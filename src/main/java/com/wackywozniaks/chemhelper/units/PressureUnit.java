package com.wackywozniaks.chemhelper.units;

import com.wackywozniaks.chemhelper.math.Expression;
import com.wackywozniaks.chemhelper.math.Operator;

public enum PressureUnit implements Unit {

    ATMOSPHERES("atmospheres", "atm", Expression.NO_EXPRESSION, Expression.NO_EXPRESSION),
    TORR("torr", "Torr", new Expression().addStep(Operator.MULT, 0.00131579), new Expression().addStep(Operator.DIV, 0.00131579)),
    PASCAL("pascal", "Pa", new Expression().addStep(Operator.MULT, 0.00000986923267), new Expression().addStep(Operator.DIV, 0.00000986923267));

    private String name;
    private String symbol;
    private Expression toStandard;
    private Expression fromStandard;

    PressureUnit(String name, String symbol, Expression toStandard, Expression fromStandard) {
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

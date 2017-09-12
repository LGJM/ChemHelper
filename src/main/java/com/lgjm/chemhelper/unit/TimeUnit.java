package com.lgjm.chemhelper.unit;

import com.lgjm.chemhelper.math.Operator;
import com.lgjm.chemhelper.math.Expression;

public enum TimeUnit implements Unit {

    SECOND("second", "s", Expression.NO_EXPRESSION, Expression.NO_EXPRESSION),
    MINUTE("minute", "min", new Expression().addStep(Operator.MULT, 60), new Expression().addStep(Operator.DIV, 60)),
    HOUR("hour", "hr", new Expression().addStep(Operator.MULT, 3600), new Expression().addStep(Operator.DIV, 3600));

    private String name;
    private String symbol;
    private Expression toStandard;
    private Expression fromStandard;

    TimeUnit(String name, String symbol, Expression toStandard, Expression fromStandard) {
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

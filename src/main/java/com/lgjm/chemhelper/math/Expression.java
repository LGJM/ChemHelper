package com.lgjm.chemhelper.math;

import java.util.LinkedList;

/**
 * Represents a mathematical expression that can be solved with a given input.
 *
 * @author ChemHelper
 * @version 08/10/2017
 */
public class Expression {

    public static final Expression NO_EXPRESSION = new Expression();

    private LinkedList<Step> steps;

    public Expression() {
        steps = new LinkedList<>();
    }

    /**
     * Adds a step to the current expression.
     *
     * @param s The step to add.
     * @return This expression with the step added.
     */
    public Expression addStep(Step s) {
        steps.add(s);
        return this;
    }

    /**
     * Adds a step to the current expression.
     *
     * @param operator The operator of the step.
     * @param num The number involved in the step.
     * @return This expression with the step added.
     */
    public Expression addStep(Operator operator, double num) {
        return addStep(new Step(operator, num));
    }

    /**
     * Executes all steps in the expression and returns the result.
     *
     * @param input The number to start with.
     * @return The result of the execution.
     */
    public double solveExpression(double input) {
        for(Step s: steps) {
            input = doStep(s, input);
        }
        return input;
    }

    /**
     * Executes the given step on the provided input.
     *
     * @param s The step to execute.
     * @param currentNum The input to execute the step on.
     * @return The result of the step.
     * @throws ArithmeticException If an invalid/null operator is passed in.
     */
    private double doStep(Step s, double currentNum) throws ArithmeticException {
        switch(s.getOperator()) {
            case ADD: return currentNum + s.getNum();
            case SUB: return currentNum - s.getNum();
            case MULT: return currentNum * s.getNum();
            case DIV: return currentNum / s.getNum();
            case POW: return Math.pow(currentNum, s.getNum());
            case ROOT: return Math.pow(currentNum, 1.0 / s.getNum());
            default: throw new ArithmeticException();
        }
    }

}

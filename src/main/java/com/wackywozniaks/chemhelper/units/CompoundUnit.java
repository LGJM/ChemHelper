package com.wackywozniaks.chemhelper.units;

import com.wackywozniaks.chemhelper.math.Operator;

import java.util.LinkedList;

/**
 * Represents a Unit composed of multiple units
 *
 * @author ChemHelper
 * @version 08/11/2017
 */
public class CompoundUnit implements Unit {

    private Unit start;
    private LinkedList<CompoundUnitStep> steps;

    public CompoundUnit(Unit start) {
        this.start = start;
        steps = new LinkedList<>();
    }

    /**
     * Adds a step to the current compound unit.
     *
     * @param s The step to add.
     * @return This compound unit with the step added.
     */
    public CompoundUnit addStep(CompoundUnitStep s) {
        steps.add(s);
        return this;
    }

    /**
     * Adds a step to the current compound unit.
     *
     * @param operator The operator of the step.
     * @param unit The unit involved in the step.
     * @return This expression with the step added.
     */
    public CompoundUnit addStep(Operator operator, Unit unit) {
        return addStep(new CompoundUnitStep(operator, unit));
    }

    //TODO
    @Override
    public String getName() {
        return "";
    }

    //TODO
    @Override
    public String getSymbol() {
        return "";
    }

    //TODO
    @Override
    public double toStandard(double start) {
        return 0;
    }

    //TODO
    @Override
    public double fromStandard(double start) {
        return 0;
    }
}

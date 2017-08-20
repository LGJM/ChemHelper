package com.wackywozniaks.chemhelper.units;

import com.wackywozniaks.chemhelper.math.Operator;

/**
 * Represents a step in creating a compound unit (e.g. * J)
 *
 * @author ChemHelper
 * @version 08/11/2017
 */
public class CompoundUnitStep {

    private Operator operator;
    private Unit unit;


    public CompoundUnitStep(Operator operator, Unit unit) {
        this.operator = operator;
        this.unit = unit;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

}

package com.lgjm.chemhelper.function;

import com.lgjm.chemhelper.dto.FunctionBean;
import com.lgjm.chemhelper.exception.InvalidInputException;
import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * The parent class of all chemistry functions
 *
 * @author ChemHelper
 * @version 09/19/2017
 */
public abstract class ChemistryFunction {

    /**
     * Represents the list of input for the function.
     */
    private FunctionBean bean;

    public ChemistryFunction(@NotNull FunctionBean bean) throws InvalidInputException {
        this.bean = bean;
        validate();
    }

    /**
     * Using the provided input, solves the problem.
     *
     * @return The result of solving.
     */
    public abstract Object solve();

    /**
     * Checks and makes sure all input (parameters) are valid.
     *
     * @return If the parameters are valid
     * @throws InvalidInputException If the parameters are invalid.
     */
    public abstract boolean validate() throws InvalidInputException;

}

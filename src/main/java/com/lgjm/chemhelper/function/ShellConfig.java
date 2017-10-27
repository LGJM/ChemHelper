package com.lgjm.chemhelper.function;

import com.lgjm.chemhelper.dto.FunctionBean;
import com.lgjm.chemhelper.exception.InvalidInputException;

/**
 * This is the function for getting the Electron Shell Configuration for a particular element.
 *
 * @author ChemHelper
 * @version 09/19/2017
 */
public class ShellConfig extends ChemistryFunction {


    public ShellConfig(FunctionBean bean) throws InvalidInputException {
        super(bean);
    }

    @Override
    public Object solve() {
        return null;
    }

    @Override
    public boolean validate() throws InvalidInputException {
        return false;
    }
}

package com.lgjm.chemhelper.util;

import com.lgjm.chemhelper.dto.FunctionBean;
import com.lgjm.chemhelper.function.ChemistryFunction;

import java.lang.reflect.InvocationTargetException;

/**
 * Contains helpful methods for functions.
 *
 * @author ChemHelper
 * @version 09/19/2017
 */
public class FunctionUtil {

    /**
     * Returns a new instance of the ChemistryFunction this bean refers to.
     *
     * @return The ChemistryFunction Object
     * @throws NoSuchMethodException when constructor doesn't exist (should be never).
     * @throws IllegalAccessException when the access permissions aren't correct.
     * @throws InvocationTargetException when there is a problem in the target.
     * @throws InstantiationException when there is a problem creating the object.
     */
//    public ChemistryFunction getFunctionFromBean(FunctionBean bean) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        return bean.getFunction().getConstructor(FunctionBean.class).newInstance(bean);
//    }

}

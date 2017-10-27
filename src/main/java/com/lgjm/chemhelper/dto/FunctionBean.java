package com.lgjm.chemhelper.dto;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.lgjm.chemhelper.function.ChemistryFunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The parent class of all beans for functions
 *
 * @author ChemHelper
 * @version 09/24/2017
 */
//public abstract class FunctionBean {
//
//    private Class<? extends ChemistryFunction> function;
//    private Class<? extends FunctionBean> thisClass;
//
//    public FunctionBean(Class<? extends ChemistryFunction> function, Class<? extends FunctionBean> thisClass) {
//        this.function = function;
//        this.thisClass = thisClass;
//    }
//
//    public abstract List<Object> getParameters();
//
//    public Class<? extends ChemistryFunction> getFunction() {
//        return function;
//    }
//
//    public Class<? extends FunctionBean> getThisClass() {
//        return thisClass;
//    }
//
//}

public class FunctionBean {

    private Map<String, Object> valueMap;
    private Class<? extends ChemistryFunction> fnClass;

    public FunctionBean(Class<? extends ChemistryFunction> fnClass) {
        this.valueMap = new HashMap<String, Object>();
        this.fnClass = fnClass;
    }

    public void addEmptyParameters(String[] params) {
        for(String s : params) {
            valueMap.put(s, null);
        }
    }

    public boolean addValue(String key, Object value) {
        if(valueMap.containsKey(key)) {
            valueMap.put(key, value);
            return true;
        }
        else {
            return false;
        }
    }

    public Object getValue(String key) {
        return valueMap.get(key);
    }

    public void emptyMap() {
        valueMap.clear();
    }

}

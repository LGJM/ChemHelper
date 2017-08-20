package com.lgjm.chemhelper.element;

/**
 * Characterizes the States of Matter
 *
 * @author ChemHelper
 * @version 09/08/2017
 */
public enum StateOfMatter {

    SOLID("Solid"),
    LIQUID("Liquid"),
    GAS("Gas");

    private String name;

    StateOfMatter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

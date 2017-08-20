package com.wackywozniaks.chemhelper.element;

import java.util.LinkedList;

/**
 * Represents a chemical compound
 *
 * @author ChemHelper
 * @version 08/12/2017
 */
public class Compound {

    private LinkedList<MultiElement> compound;

    public Compound() {
        this.compound = new LinkedList<>();
    }

    public LinkedList<MultiElement> getCompound() {
        return compound;
    }

    public void setCompound(LinkedList<MultiElement> compound) {
        this.compound = compound;
    }

    /**
     *
     * @param element
     * @return
     */
    public Compound addElement(MultiElement element) {
        compound.add(element);
        return this;
    }

    /**
     *
     * @param element
     * @param num
     * @return
     */
    public Compound addElement(Element element, int num) {
        return addElement(new MultiElement(element, num));
    }

}

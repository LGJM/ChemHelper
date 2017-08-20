package com.lgjm.chemhelper.element;

/**
 * Represents an element and a number.
 *
 * @author ChemHelper
 * @version 08/12/2017
 */
public class MultiElement {

    private Element element;
    private int num;

    public MultiElement(Element element, int num) {
        this.element = element;
        this.num = num;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}

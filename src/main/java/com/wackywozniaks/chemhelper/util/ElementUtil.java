package com.wackywozniaks.chemhelper.util;

import com.wackywozniaks.chemhelper.element.Element;
import com.wackywozniaks.chemhelper.element.ElementGroup;
import com.wackywozniaks.chemhelper.element.ElementType;
import com.wackywozniaks.chemhelper.element.StateOfMatter;

/**
 * A class containing handy method(s) for elements.
 *
 * @author ChemHelper
 * @version 08/10/2017
 */
public class ElementUtil {

    /**
     * Returns the group (family) of the given element.
     *
     * @param e The element to test.
     * @return The group of the element.
     */
    public static ElementGroup getElementGroup(Element e) {
        int num = e.getNum();
        int group = e.getGroup();

        if(num >= 57 && num <= 70) return ElementGroup.LANTHANIDE;
        else if(num >= 89 && num <= 102) return ElementGroup.ACTINIDE;
        else if(group == 1 && num != 1) return ElementGroup.ALKALI;
        else if(group == 2) return ElementGroup.ALKALINE_EARTH;
        else if(group >= 3 && group <= 12) return ElementGroup.TRANSITION_METAL;
        else if(group == 13) return ElementGroup.ICOSAGEN;
        else if(group == 14) return ElementGroup.TETRAGEN;
        else if(group == 15) return ElementGroup.PNICTOGEN;
        else if(group == 16) return ElementGroup.CHALCOGEN;
        else if(group == 17) return ElementGroup.HALOGEN;
        else if(group == 18) return ElementGroup.NOBEL_GAS;
        else return ElementGroup.NONE;
    }

    /**
     * Returns the type (metal, non-metal, metalloid) of the given element.
     *
     * @param e The element to test.
     * @return The type of the element.
     */
    public static ElementType getElementType(Element e) {
        int num = e.getNum();
        int group = e.getGroup();
        int period = e.getPeriod();

        if(num == 1 || group >= 17 || period <= group - 12) return ElementType.NON_METAL;
        else if(group <= 12 || period >= group - 9 || num == 13) return ElementType.METAL;
        else return ElementType.METALLOID;
    }

    /**
     * Returns the state of matter of the given element at room temperature.
     *
     * @param e The element to test.
     * @return The state of matter of the element at room temperature.
     */
    public static StateOfMatter getStateAtRoomTemp(Element e) {
        double boil = e.getBoil();
        double freeze = e.getFreeze();

        if(boil < ConstantUtil.ROOM_TEMPERATURE.getValue()) return StateOfMatter.GAS;
        else if(freeze > ConstantUtil.ROOM_TEMPERATURE.getValue() || boil == Double.MAX_VALUE || freeze == 0) return StateOfMatter.SOLID;
        else return StateOfMatter.LIQUID;
    }

    /**
     * Gets the electron shell configuration for the given element.
     *
     * @param e The element to get the configuration of.
     * @return The shell configuration of the element.
     */
    public String getElectronShellConfiguration(Element e) {
        final int S = 2, P = 6, D = 10, F = 14;
        String shell = "";
        for(int row = 1, elec = e.getNum(); row <= e.getPeriod(); row++) {
            //Adds the s for the row
            int s;
            if(elec < S) {
                s = elec;
                elec = 0;
            }
            else {
                s = S;
                elec -= S;
            }
            shell += row + "s^{" + s + "}";

            //Adds the f for the row two before, if applicable
            if(row >= 6 && elec > 0) { //The first row with an insertion of a previous f row in it is 6
                int f;
                if(elec < F) {
                    f = elec;
                    elec = 0;
                }
                else {
                    f = F;
                    elec -= F;
                }
                shell += (row - 2) + "f^{" + f + "}";
            }

            //Adds the d for the row before, if applicable
            if(row >= 4 && elec > 0) { //The first row with an insertion of a previous d row in it is 4
                int d;
                if(elec < D) {
                    d = elec;
                    elec = 0;

                    //Deals with exception where d should be filled before the next s.
                    if(d == D - 1 || d == D / 2 - 1) {
                        d++;
                        int index = shell.lastIndexOf("s");
                        shell = shell.substring(0, index + 3) + (S - 1) + shell.substring(index + 4);
                    }
                }
                else {
                    d = D;
                    elec -= D;
                }
                shell += (row - 1) + "d^{" + d + "}";
            }

            //Adds the p for the row, if applicable
            if(row >= 2 && elec > 0) { //The first row with a p section is 2
                int p;
                if(elec < P) {
                    p = elec;
                    elec = 0;
                }
                else {
                    p = P;
                    elec -= P;
                }
                shell += row + "p^{" + p + "}";
            }
        }
        return shell;
    }

}

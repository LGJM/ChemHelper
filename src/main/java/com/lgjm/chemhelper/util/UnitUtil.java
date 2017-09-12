package com.lgjm.chemhelper.util;

import com.lgjm.chemhelper.unit.Unit;

/**
 * A class containing handy method(s) for unit.
 *
 * @author ChemHelper
 * @version 08/10/2017
 */
public class UnitUtil {

    /**
     * Converts the input from one unit to the other. Units must be of the same type.
     *
     * @param num The number to convert.
     * @param from The unit the number is in.
     * @param to The unit to convert the number to.
     * @param <U> The Unit Type to convert between.
     * @return The converted number.
     */
    public static <U extends Unit> double convertUnit(double num, U from, U to) {
        return to.fromStandard(from.toStandard(num));
    }

}

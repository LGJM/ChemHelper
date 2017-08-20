package com.lgjm.chemhelper.units;

public enum MetricPrefix {

    PICO("pico", "p", -12),
    NANO("nano", "n", -9),
    MICRO("micro", "\u00B5", -6),
    MILLI("milli", "m", -3),
    CENTI("centi", "c", -2),
    DECI("deci", "d", -1),
    BASE("", "", 0),
    DECA("deca", "da", 1),
    HECTO("hecto", "h", 2),
    KILO("kilo", "k", 3),
    MEGA("mega", "M", 6),
    GIGA("giga", "G", 9),
    TERRA("terra", "T", 12);

    public String name;
    public String symbol;
    public int power;

    MetricPrefix(String name, String symbol, int power) {
        this.name = name;
        this.symbol = symbol;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPower() {
        return power;
    }

    /**
     * Converts the given number to the base prefix.
     *
     * @param num The number to convert.
     * @return The converted number.
     */
    public double toBase(double num) {
        return num * Math.pow(10, getPower());
    }

    /**
     * Converts the given number to the current prefix.
     *
     * @param num The number to convert.
     * @return The converted number.
     */
    public double fromBase(double num) {
        return num / Math.pow(10, getPower());
    }

}

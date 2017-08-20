package com.lgjm.chemhelper.math;

public enum Operator {

    ADD("+"),
    SUB("-"),
    MULT("*"),
    DIV("/"),
    POW("^"),
    ROOT("^1/");

    private String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}

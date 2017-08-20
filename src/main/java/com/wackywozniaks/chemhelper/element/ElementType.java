package com.wackywozniaks.chemhelper.element;

public enum ElementType {

    METAL("Metal"),
    NON_METAL("Non Metal"),
    METALLOID("Metalloid");

    private String name;

    ElementType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

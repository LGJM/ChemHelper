package com.lgjm.chemhelper.element;

public enum ElementGroup {

    ACTINIDE("Actinide"),
    ALKALI("Alkali Metal"),
    ALKALINE_EARTH("Alkaline Earth Metal"),
    CHALCOGEN("Chalcogen (Oxygen Family)"),
    HALOGEN("Halogen"),
    ICOSAGEN("Icosagen (Boron Family)"),
    LANTHANIDE("Lanthanide"),
    NOBEL_GAS("Noble Gas"),
    NONE("None"),
    PNICTOGEN("Pnictogen (Nitrogen Family)"),
    TETRAGEN("Tetragen (Carbon Family)"),
    TRANSITION_METAL("Transition Metal");

    private String name;

    ElementGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

package com.lgjm.chemhelper.element;

/**
 * Characterizes the elements and their properties.
 *
 * @author ChemHelper
 * @version 09/09/2017
 */
public enum Element {

    HYDROGEN(1, 1, 1, "Hydrogen", "H", 1.00794, 20.28, 13.81, 0.00008988),
    HELIUM(2, 18, 1, "Helium", "He", 4.002602, 4.22, .95, .0001785),
    LITHIUM(3, 1, 2, "Lithium", "Li", 6.941, 1615, 453.65, .534),
    BERYLLIUM(4, 2, 2, "Beryllium", "Be", 9.012182, 2744, 1560, 1.85),
    BORON(5, 13, 2, "Boron", "B", 10.811, 4273, 2348, 2.37),
    CARBON(6, 14, 2, "Carbon", "C", 12.0107, 4098, 3823, 2.2670),
    NITROGEN(7, 15, 2, "Nitrogen", "N", 14.0067, 77.36, 63.15, .0012506),
    OXYGEN(8, 16, 2, "Oxygen", "O", 15.9994, 90.2, 54.36, .001429),
    FLUORINE(9, 17, 2, "Fluorine", "F", 18.9984032, 85.03, 53.53, 00.1696),
    NEON(10, 18, 2, "Neon", "Ne", 20.1797, 27.07, 24.56, .0008999),
    SODIUM(11, 1, 3, "Sodium", "Na", 22.98976928, 1156, 370.95, .97),
    MAGNESIUM(12, 2, 3, "Magnesium", "Mg", 24.305, 1363, 923, 1.74),
    ALUMINIUM(13, 13, 3, "Aluminum", "Al", 26.9815386, 2792, 933.437, 2.7),
    SILICON(14, 14, 3, "Silicon", "Si", 28.0855, 3538, 1687, 2.3296),
    PHOSPHOROUS(15, 15, 3, "Phosphorus", "P", 30.973762, 553.65, 317.3, 1.82),
    SULFUR(16, 16, 3, "Sulfur", "S", 32.065, 717.75, 388.36, 2.067),
    CHLORINE(17, 17, 3, "Chlorine", "Cl", 35.453, 239.11, 171.65, .003214),
    ARGON(18, 18, 3, "Argon", "Ar", 39.948, 87.3, 83.8, .0017837),
    POTASSIUM(19, 1, 4, "Potassium", "K", 39.0983, 1032, 336.53, .89),
    CALCIUM(20, 2, 4, "Calcium", "Ca", 40.078, 1757, 1115, 1.54),
    SCANDIUM(21, 3, 4, "Scandium", "Sc", 44.955912, 3109, 1814, 2.99),
    TITANIUM(22, 4, 4, "Titanium", "Ti", 47.867, 3560, 1941, 4.5),
    VANADIUM(23, 5, 4, "Vanadium", "V", 50.9415, 3680, 2183, 6),
    CHROMIUM(24, 6, 4, "Chromium", "Cr", 51.9961, 2944, 2180, 7.15),
    MANGANESE(25, 7, 4, "Manganese", "Mn", 54.938045, 2334, 1519, 7.3),
    IRON(26, 8, 4, "Iron", "Fe", 55.845, 3134, 1811, 7.874),
    COBALT(27, 9, 4, "Cobalt", "Co", 58.933195, 3200, 1768, 8.86),
    NICKEL(28, 10, 4, "Nickel", "Ni", 58.6934, 3186, 1728, 8.912),
    COPPER(29, 11, 4, "Copper", "Cu", 63.546, 2835, 1357.77, 8.933),
    ZINC(30, 12, 4, "Zinc", "Zn", 65.38, 1180, 692.68, 7.134),
    GALLIUM(31, 13, 4, "Gallium", "Ga", 69.723, 2477, 302.91, 5.91),
    GERMANIUM(32, 14, 4, "Germanium", "Ge", 72.64, 3106, 1211.4, 5.323),
    ARSENIC(33, 15, 4, "Arsenic", "As", 74.9216, 887, 1090, 5.776),
    SELENIUM(34, 16, 4, "Selenium", "Se", 78.96, 958, 493.65, 4.809),
    BROMINE(35, 17, 4, "Bromine", "Br", 79.904, 331.95, 265.95, 3.11),
    KRYPTON(36, 18, 4, "Krypton", "Kr", 83.798, 119.93, 115.79, .003733),
    RUBIDIUM(37, 1, 5, "Rubidium", "Rb", 85.4678, 961, 312.46, 1.53),
    STRONTIUM(38, 2, 5, "Strontium", "Sr", 87.62, 1655, 1050, 2.64),
    YTTRIUM(39, 3, 5, "Yttrium", "Y", 88.90585, 3618, 1795, 4.47),
    ZIRCONIUM(40, 4, 5, "Zirconium", "Zr", 91.224, 4682, 2128, 6.52),
    NIOBIUM(41, 5, 5, "Niobium", "Nb", 92.90638, 5017, 2750, 8.57),
    MOLYBDENUM(42, 6, 5, "Molybdenum", "Mo", 95.96, 4912, 2896, 10.2),
    TECHNETIUM(43, 7, 5, "Technetium", "Tc", 98, 4538, 2430, 11),
    RUTHENIUM(44, 8, 5, "Ruthenium", "Ru", 101.07, 4423, 2607, 12.1),
    RHODIUM(45, 9, 5, "Rhodium", "Rh", 102.90550, 3968, 2237, 12.4),
    PALLADIUM(46, 10, 5, "Palladium", "Pd", 106.42, 3236, 1828.05, 12),
    SILVER(47, 11, 5, "Silver", "Ag", 107.8682, 2435, 1234.93, 10.501),
    CADMIUM(48, 12, 5, "Cadmium", "Cd", 112.411, 1040, 594.22, 8.69),
    INDIUM(49, 13, 5, "Indium", "In", 114.818, 2345, 429.75, 7.31),
    TIN(50, 14, 5, "Tin", "Sn", 118.71, 2875, 505.08, 7.287),
    ANTIMONY(51, 15, 5, "Antimony", "Sb", 121.76, 1860, 903.78, 6.685),
    TELLURIUM(52, 16, 5, "Tellurium", "Te", 127.6, 1261, 722.66, 6.232),
    IODINE(53, 17, 5, "Iodine", "I", 126.90447, 457.55, 386.85, 4.93),
    XENON(54, 18, 5, "Xenon", "Xe", 131.293, 165.03, 161.36, .005887),
    CESIUM(55, 1, 6, "Cesium", "Cs", 132.9054519, 944, 301.59, 1.93),
    BARIUM(56, 2, 6, "Barium", "Ba", 137.327, 2170, 1000, 3.62),
    LANTHANUM(57, -1, 6, "Lanthanum", "La", 138.90547, 3737, 1191, 6.15),
    CERIUM(58, -1, 6, "Cerium", "Ce", 140.116, 3697, 1071, 6.77),
    PRASEODYMIUM(59, -1, 6, "Praseodymium", "Pr", 140.90765, 3793, 1204, 6.77),
    NEODYMIUM(60, -1, 6, "Neodymium", "Nd", 144.242, 3347, 1294, 7.01),
    PROMETHIUM(61, -1, 6, "Promethium", "Pm", 145, 3273, 1315, 7.26),
    SAMARIUM(62, -1, 6, "Samarium", "Sm", 150.36, 2067, 1347, 7.52),
    EUROPIUM(63, -1, 6, "Europium", "Eu", 151.964, 1802, 1095, 5.24),
    GADOLINIUM(64, -1, 6, "Gadolinium", "Gd", 157.25, 3546, 1586, 7.9),
    TERBIUM(65, -1, 6, "Terbium", "Tb", 158.92535, 3503, 1629, 8.23),
    DYSPROSIUM(66, -1, 6, "Dysprosium", "Dy", 162.5, 2840, 1685, 8.55),
    HOLMIUM(67, -1, 6, "Holmium", "Ho", 164.93032, 2973, 1747, 8.8),
    ERBIUM(68, -1, 6, "Erbium", "Er", 167.259, 3141, 1802, 9.07),
    THULIUM(69, -1, 6, "Thulium", "Tm", 168.93421, 2223, 1818, 9.32),
    YTTERBIUM(70, -1, 6, "Ytterbium", "Yb", 173.054, 1469, 1092, 6.9),
    LUTETIUM(71, 3, 6, "Lutetium", "Lu", 174.9668, 3675, 1936, 9.84),
    HAFNIUM(72, 4, 6, "Hafnium", "Hf", 178.49, 4876, 2506, 13.3),
    TANTALUM(73, 5, 6, "Tantalum", "Ta", 180.94788, 5731, 3290, 16.4),
    TUNGSTEN(74, 6, 6, "Tungsten", "W", 183.84, 5828, 3695, 19.3),
    RHENIUM(75, 7, 6, "Rhenium", "Re", 186.207, 5869, 3459, 20.8),
    OSMIUM(76, 8, 6, "Osmium", "Os", 190.23, 5285, 3306, 22.57),
    IRIDIUM(77, 9, 6, "Iridium", "Ir", 192.217, 4701, 2719, 22.42),
    PLATINUM(78, 10, 6, "Platinum", "Pt", 195.084, 4098, 2041.55, 21.46),
    GOLD(79, 11, 6, "Gold", "Au", 196.966569, 3129, 1337.33, 19.282),
    MERCURY(80, 12, 6, "Mercury", "Hg", 200.59, 629.88, 234.32, 13.5336),
    THALLIUM(81, 13, 6, "Thallium", "Tl", 204.3833, 1746, 577, 11.8),
    LEAD(82, 14, 6, "Lead", "Pb", 207.2, 2022, 600.61, 11.342),
    BISMUTH(83, 15, 6, "Bismuth", "Bi", 208.98040, 1837, 544.55, 9.807),
    POLONIUM(84, 16, 6, "Polonium", "Po", 209, 1235, 527, 9.32),
    ASTATINE(85, 17, 6, "Astatine", "At", 210, Double.MAX_VALUE, 575, 7),
    RADON(86, 18, 6, "Radon", "Rn", 222, 211.45, 202, .00973),
    FRANCIUM(87, 1, 7, "Francium", "Fr", 223, Double.MAX_VALUE, 300, Double.MAX_VALUE),
    RADIUM(88, 2, 7, "Radium", "Ra", 226, 1413, 973, 5),
    ACTINIUM(89, -2, 7, "Actinium", "Ac", 227, 3471, 1324, 10.07),
    THORIUM(90, -2, 7, "Thorium", "Th", 232.03806, 5061, 2023, 11.72),
    PROTACTINIUM(91, -2, 7, "Protactinium", "Pa", 231.03588, Double.MAX_VALUE, 1845, 15.37),
    URANIUM(92, -2, 7, "Uranium", "U", 238.02891, 4404, 1408, 18.95),
    NEPTUNIUM(93, -2, 7, "Neptunium", "Np", 237, 4175, 917, 20.25),
    PLUTONIUM(94, -2, 7, "Plutonium", "Pu", 244, 3501, 913, 19.84),
    AMERICIUM(95, -2, 7, "Americium", "Am", 243, 2284, 1449, 13.69),
    CURIUM(96, -2, 7, "Curium", "Cm", 247, 3400, 1618, 13.51),
    BERKELIUM(97, -2, 7, "Berkelium", "Bk", 247, Double.MAX_VALUE, 1323, 14),
    CALIFORNIUM(98, -2, 7, "Californium", "Cf", 251, Double.MAX_VALUE, 1173, Double.MAX_VALUE),
    EINSTEINIUM(99, -2, 7, "Einsteinium", "Es", 252, Double.MAX_VALUE, 1133, Double.MAX_VALUE),
    FERMIUM(100, -2, 7, "Fermium", "Fm", 257, Double.MAX_VALUE, 1800, Double.MAX_VALUE),
    MENDELEVIUM(101, -2, 7, "Mendelevium", "Md", 258, Double.MAX_VALUE, 1100, Double.MAX_VALUE),
    NOBELIUM(102, -2, 7, "Nobelium", "No", 259, Double.MAX_VALUE, 1100, Double.MAX_VALUE),
    LAWRENCIUM(103, 3, 7, "Lawrencium", "Lr", 262, Double.MAX_VALUE, 1900, Double.MAX_VALUE),
    RUTHERFORDIUM(104, 4, 7, "Rutherfordium", "Rf", 263, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    DUBNIUM(105, 5, 7, "Dubnium", "Db", 268, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    SEABORGIUM(106, 6, 7, "Seaborgium", "Sg", 271, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    BOHRIUM(107, 7, 7, "Bohrium", "Bh", 270, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    HASSIUM(108, 8, 7, "Hassium", "Hs", 270, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    MEITNERIUM(109, 9, 7, "Meitnerium", "Mt", 278, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    DARMSTADTIUM(110, 10, 7, "Darmstadtium", "Ds", 281, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    ROENTGENIUM(111, 11, 7, "Roetgenium", "Rg", 281, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    COPERNICIUM(112, 12, 7, "Copernicium", "Cn", 285, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    NIHONIUM(113, 13, 7, "Nihonium", "Nh", 286, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    FLEROVIUM(114, 14, 7, "Flerovium", "Fl", 289, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    MOSCOVIUM(115, 15, 7, "Moscovium", "Mc", 289, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    LIVERMORIUM(116, 16, 7, "Livermorium", "Lv", 293, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    TENNESSINE(117, 17, 7, "Tennessine", "Ts", 294, Double.MAX_VALUE, 0, Double.MAX_VALUE),
    OGANESSON(118, 18, 7, "Oganesson", "Og", 294, Double.MAX_VALUE, 0, Double.MAX_VALUE);

    private int num;
    private int group;
    private int period;
    private String name;
    private String sym;
    private double mass;
    private double boil;
    private double freeze;
    private double dense;

    Element(int num, int group, int period, String name, String sym, double mass, double boil, double freeze, double dense) {
        this.num = num;
        this.group = group;
        this.period = period;
        this.name = name;
        this.sym = sym;
        this.mass = mass;
        this.boil = boil;
        this.freeze = freeze;
        this.dense = dense;
    }

    public int getNum() {
        return num;
    }

    public int getGroup() {
        return group;
    }

    public int getPeriod() {
        return period;
    }

    public String getName() {
        return name;
    }

    public String getSym() {
        return sym;
    }

    public double getMass() {
        return mass;
    }

    public double getBoil() {
        return boil;
    }

    public double getFreeze() {
        return freeze;
    }

    public double getDense() {
        return dense;
    }

}

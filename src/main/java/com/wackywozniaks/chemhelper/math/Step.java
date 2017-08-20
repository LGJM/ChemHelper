package com.wackywozniaks.chemhelper.math;

public class Step {

    private Operator operator;
    private double num;

    public Step(Operator operator, double num) {
        this.operator = operator;
        this.num = num;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

}

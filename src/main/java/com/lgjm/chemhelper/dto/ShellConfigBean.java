package com.lgjm.chemhelper.dto;

import com.lgjm.chemhelper.function.ShellConfig;

import java.util.ArrayList;
import java.util.List;

public class ShellConfigBean extends FunctionBean {

    private Boolean isAtomicNum;
    private Boolean isSymbol;
    private Boolean isName;
    private String input;

    public ShellConfigBean() {
        super(ShellConfig.class, ShellConfigBean.class);
    }

    @Override
    public List<Object> getParameters() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(getAtomicNum());
        list.add(getSymbol());
        list.add(getName());
        list.add(getInput());
        return list;
    }

    public Boolean getAtomicNum() {
        return isAtomicNum;
    }

    public void setAtomicNum(Boolean atomicNum) {
        isAtomicNum = atomicNum;
    }

    public Boolean getSymbol() {
        return isSymbol;
    }

    public void setSymbol(Boolean symbol) {
        isSymbol = symbol;
    }

    public Boolean getName() {
        return isName;
    }

    public void setName(Boolean name) {
        isName = name;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}

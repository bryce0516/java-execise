package com.company;

import java.awt.*;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimentions dimenstions;

    public Case(String model, String manufacturer, String powerSupply, Dimentions dimenstions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimenstions = dimenstions;
    }

    public void pressPowerButton() {
        System.out.println("Power Button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimentions getDimenstions() {
        return dimenstions;
    }
}

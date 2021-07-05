package com.company;

public class Car2 extends Vehicle2{
    private int doors;
    private int engineCapacity;

    public Car2(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

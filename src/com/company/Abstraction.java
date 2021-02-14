package com.company;

public abstract class Abstraction {

    Implementor imp;

    //constructor with implementor as input argument
    public Abstraction(Implementor imp){
        this.imp=imp;
    }

    abstract public void operate();
}

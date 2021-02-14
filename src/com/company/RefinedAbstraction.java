package com.company;

public class RefinedAbstraction extends Abstraction{


    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void operate() {
        System.out.print("The operation is");
        imp.operate();
    }
}

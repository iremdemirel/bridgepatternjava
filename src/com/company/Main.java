package com.company;

public class Main {

    public static void main(String[] args) {

        Abstraction client = new RefinedAbstraction(new ImplementationA());
        client.operate();

        // Implementation has changed
        client.imp = new ImplementationB();
        client.operate();

    }
}

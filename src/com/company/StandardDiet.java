package com.company;

public class StandardDiet implements Kitchen {
    @Override
    public void cook() {
        System.out.println("Preparing standard diet");
    }
}

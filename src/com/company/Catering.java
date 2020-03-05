package com.company;

public class Catering {
    private Kitchen vegeDiet;
    private Kitchen standardDiet;
    private Kitchen diabeticDiet;

    public Catering(){
        vegeDiet = new VegeDiet();
        standardDiet = new StandardDiet();
        diabeticDiet = new DiabeticDiet();
    }

    public void prepareVegeDiet(){
        vegeDiet.cook();
    }

    public void  prepareStandardDiet(){
        standardDiet.cook();
    }

    public void prepareDiabeticDiet(){
        diabeticDiet.cook();
    }
}

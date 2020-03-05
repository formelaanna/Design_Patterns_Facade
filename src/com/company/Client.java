package com.company;

public class Client {

    public static void main(String[] args) {
	Catering catering = new Catering();

	catering.prepareVegeDiet();
	catering.prepareStandardDiet();
	catering.prepareDiabeticDiet();
    }
}

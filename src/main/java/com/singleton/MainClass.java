package com.singleton;

public class MainClass {
    public static void main(String[] args) {
        Calculation calculation = Calculation.getCalculationObject();
        System.out.println(calculation.calculation_tax(200.0));


    }
}

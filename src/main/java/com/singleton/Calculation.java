package com.singleton;

public class Calculation {

    private static Calculation calculation;
    private Calculation() {
        System.out.println("Default Constructor Singleton Class");
    }

    public double calculation_tax(Double tax_amount){
        return tax_amount *= .2;
    }

    public static Calculation getCalculationObject(){
        if(calculation == null){
            synchronized (Calculation.class){
                if (calculation == null){
                    return calculation = new Calculation();
                }
            }
        }
        return calculation;
    }
}

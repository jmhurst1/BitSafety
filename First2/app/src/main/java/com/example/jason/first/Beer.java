package com.example.jason.first;

import java.io.Serializable;

public class Beer extends Drink {
    /** Ounces in Beer     */
    public static final double OUNCES = 12;
    /** Percent Alcohol of beer */
    public static final double PERCENT = 5;


    public Beer() {
        super(OUNCES, PERCENT);

    }
}
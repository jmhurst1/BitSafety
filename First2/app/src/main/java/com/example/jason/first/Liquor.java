package com.example.jason.first;

import java.io.Serializable;

public class Liquor extends Drink {
    /** Ounces in liquor     */
    public static final double OUNCES = 1.5;
    /** Percent Alcohol of liquor */
    public static final double PERCENT = 37;


    /**
     * Constructor for Wine object
     * @param time
     */
    public Liquor() {
        super(OUNCES, PERCENT);

    }
}
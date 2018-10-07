package com.example.jason.first;
import java.io.Serializable;

public class Wine extends Drink  {
    /** Ounces in wine     */
    public static final double OUNCES = 5;
    /** Percent Alcohol of wine */
    public static final double PERCENT = 12;


    /**
     * Constructor for Wine object
     * @param time
     */
    public Wine() {
        super(OUNCES, PERCENT);

    }
}
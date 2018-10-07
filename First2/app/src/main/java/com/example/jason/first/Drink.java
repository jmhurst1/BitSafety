package com.example.jason.first;

public abstract class Drink {
    /** Oz of alcohol consumed */
    private double alcOz;

    /**
     * Constructor for drink object.
     * @param ounces
     * @param percent
     */
    public Drink(double ounces, double percent) {
        setAlcOz(ounces, percent);
    }


    /**
     * @return the alcOz
     */
    public double getAlcOz() {
        return alcOz;
    }

    /**
     * @param ounces the alcOz to set
     */
    public void setAlcOz(double ounces, double percent) {
        this.alcOz = ounces * (percent / 100);
    }

}

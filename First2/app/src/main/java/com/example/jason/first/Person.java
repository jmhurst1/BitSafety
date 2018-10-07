package com.example.jason.first;

//import java.time.Duration;
//import java.time.Instant;
import java.util.ArrayList;


public class Person{
    private String name;
    private int sex;
    private double weight;
    private ArrayList<Drink> drinks;
    private int expval;
    public double bac;
//    private Instant start;

    public Person(String name, int sex, double weight) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.drinks = new ArrayList<Drink>();
        this.expval = 0;
        this.bac = 0;
    }

    public void updatebac() {
        if (sex < 0) {
            bac = ((totalalc() * 5.14) / (weight * .73));// - .015 * hoursSince();
        } else {
            bac = ((totalalc() * 5.14) / (weight * .66));// - .015 * hoursSince();
        }
    }

    public void addDrinks(Drink x) {
        drinks.add(x);
        updatebac();
    }

    public double totalalc() {
        double total = 0;

        for (int i = 0; i < drinks.size(); i++) {
            total += drinks.get(i).getAlcOz();
        }
        return total;
    }

//    public long hoursSince() {
//        Instant end = Instant.now();
//        Duration timeElapsed = Duration.between(start, end);
//        return timeElapsed.toHours();
//    }

    public String getName() {
        return name;
    }

    public String getSex() {
        if (sex < 0) {
            return "Male";
        }
        return "Female";
    }

    public void bacToExp() {
        if (bac == 0) {
            expval = 0;
        }
        if (0 < bac && bac <= .08) {
            expval = 1;
        }
        if (.08 < bac && bac <= .16) {
            expval = 2;
        }
        if (.16 < bac) {
            expval = 3;
        }
    }

    public String setExp() {
        if (expval == 0) {
            return "Good";
            // set picture 0
        } else if (expval == 1) {
            return "buzzed";
        } else if (expval == 2) {
            return "Droopy";
        } else {
            return "Puke";
        }
    }
}
package data;

import java.util.Random;


public abstract class Pet {
    public static Random rd = new Random();
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeigth() {
        return weight;
    }

    public void setWeigth(double weigth) {
        this.weight = weigth;
    }
    
    public abstract double run();
    public abstract void showRecord();
    
}

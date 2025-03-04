package data;

import java.util.Random;

public class Dog extends Pet {
    public static final int MAX_SPEED = 50;
    protected Random rd = new Random();
    protected int tmp;
    public Dog(String name, int old, double weight) {
        super(name, old, weight);
    }
    
    @Override
    public int run() {        
        tmp = rd.nextInt(MAX_SPEED);
        return tmp;
    }    
    
    @Override
    public void showRecord() {
        System.out.println("My speed is of " + name + " is " + tmp);
    }
}

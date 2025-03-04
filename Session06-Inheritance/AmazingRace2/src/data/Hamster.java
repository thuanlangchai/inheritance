package data;


import java.util.Random;


public class Hamster extends Pet {
    public static final double MAX_SPEED = 10;

    public Hamster(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                            "HAMSTER", name, yob, weight, run());
    }
    
    
    
}

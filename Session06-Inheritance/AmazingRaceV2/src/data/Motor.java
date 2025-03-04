package data;

import java.util.Random;


public class Motor implements DeathRace {
    public static final double MAX_SPEED = 180;
    public static Random rd = new Random();
    private String model;
    private String volume;
    private String vin;
    
    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    
    public double run() {
        return new Random().nextDouble() * Motor.MAX_SPEED;
    }
    
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|",
                            "MOTOR", model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        return run() * 3;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-10s|%-8s|%11s|%5.1f|\n",
        "MOTOR-RACER", model, volume, vin, run());
    }
    
}

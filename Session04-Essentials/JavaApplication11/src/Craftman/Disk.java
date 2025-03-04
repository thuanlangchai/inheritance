package Craftman;


public class Disk {
    private String owner;
    private String color;  
    private String smile;
    private double raidus;
    public static final double PI = 3.1415;
    
    
    public Disk(String owner, String color, String smile, double raidus) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.raidus = raidus;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    @Override
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", smile=" + smile + ", raidus=" + raidus + '}';
    }
    
    public double getArea() {
        return Disk.PI * Math.pow(raidus, 2);
    }
    
    public void paint() {
        System.out.printf("|DISK     |%-15s|%-10s|%4s|%4.1f|%7.2f|\n",
                            owner, color, smile, raidus, getArea());
    }
}

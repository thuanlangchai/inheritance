package data;


public class Disk extends Shape{
    public static final double PI = 3.14;
    private double radius;

    public Disk(String owener, String color, String borderColor, double radius) {
        super(owener, color, borderColor);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * PI;
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|  - |%4.1f|%7.2f|\n",
                           "DISK ", owener, color, borderColor, radius,getArea());
    }
    }
    
    


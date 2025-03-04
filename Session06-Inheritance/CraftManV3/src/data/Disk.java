package data;


public class Disk extends Shape{
    public static final double Pi = 3.14;
    private double radius;
    
    public Disk(double radius, String owner, String color, String boderColor) {
        super(owner, color, boderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Disk.Pi;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Disk.Pi * radius;
    }
    
    @Override
    public void paint() {
        System.out.printf("|Disk      |%-10s|%-10s|%-10s|  - |%4.1f|%7.2f|\n",
                            owner, color, boderColor, radius, getArea());
    }
    
}

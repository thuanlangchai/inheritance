package data;




public class Rectangle extends Shape{
    protected double width, length;
    
    public Rectangle(String owener, String color, String borderColor, double width, double length) {
        super(owener, color, borderColor);
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return width * length;
    }
    
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                           "RECTANGLE" , owener, color, borderColor, width, length, getArea());
    }
}

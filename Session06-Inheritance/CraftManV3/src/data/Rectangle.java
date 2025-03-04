package data;


public class Rectangle extends Shape{
    protected double a, b;

    public Rectangle(double a, double b, String owner, String color, String boderColor) {
        super(owner, color, boderColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
    
    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
   
    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                            owner, color, boderColor, a, b, getArea());
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
}

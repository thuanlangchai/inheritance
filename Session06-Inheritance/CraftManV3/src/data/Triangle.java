package data;


public class Triangle extends Shape {
    protected double a, b, c;

    public Triangle(double a, double b, double c, String owner, String color, String boderColor) {
        super(owner, color, boderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    @Override
    public double getPerimeter() {
        return (a + b + c);
    }
    
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return p * (p - a) * (p - b) *(p - c);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    @Override
    public void paint() {
           System.out.printf("|TRIANGLE  |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                            owner, color, boderColor, a, getPerimeter() ,getArea());
    }
    
}

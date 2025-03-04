package data;

public class RightTriangle extends Triangle {
    private double a, b;

    public RightTriangle(double a, double b, String owner, String color, String boderColor) {
        super(a, b, Math.sqrt(a * a + b * b), owner, color, boderColor);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void paint() {
           System.out.printf("|R.TRIANGLE|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                            owner, color, boderColor, a, getPerimeter() ,getArea());
    }
}

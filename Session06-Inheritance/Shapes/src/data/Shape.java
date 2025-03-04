package data;


public abstract class Shape {
    protected String owener;
    protected String color;
    protected String borderColor;

    public Shape(String owener, String color, String borderColor) {
        this.owener = owener;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwener() {
        return owener;
    }

    public void setOwener(String owener) {
        this.owener = owener;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
}

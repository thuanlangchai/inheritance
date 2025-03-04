package data;


public class Square extends Rectangle{
    private double edge;

    public Square(String owener, String color, String borderColor, double edge) {
        super(owener, color, borderColor, edge, edge);
        this.edge = edge;
    }
    
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|  - |%4.1f|%7.2f|\n",
                            "SQUARE", owener, color, borderColor, length, getArea());
    }
}

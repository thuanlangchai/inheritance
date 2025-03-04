package Craftman;

public class Square extends Rectangle {
    
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }
        
    @Override
    public void paint() {
    System.out.printf("|SQUARE   |%-15s|%-10s|  - |%4.1f|%7.2f|\n",
                            owner, color, length, getArea());
    }

}

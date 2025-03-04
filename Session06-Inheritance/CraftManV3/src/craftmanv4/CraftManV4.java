package craftmanv4;

import data.Disk;
import data.Rectangle;
import data.RightTriangle;
import data.Shape;
import data.Square;
import data.Triangle;
import java.util.Random;
import java.util.Scanner;

public class CraftManV4 {

    public static void main(String[] args) {
        
        
        
    }

    public static void sortShape() {
        Shape[] x = new Shape[5];
        x[0] = new Rectangle(5, 6, "Ong", "Red", "Green");
        x[1] = new Square(4, "Ba", "Yellow", "Blue");
        x[2] = new Triangle(3, 4, 5, "Bo", "Brown", "Gray");
        x[3] = new Disk(6, "Con", "Black", "Pink");
        x[4] = new RightTriangle(6, 4, "Tui", "Blue", "Sky");
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[j].getArea() > x[i].getArea()) {
                    Shape tmp = x[j];
                    x[j] = x[i];
                    x[i] = tmp;
                }
            }
        }
        for (Shape shape : x) {
            shape.paint();
        }

    }

    public static void playWithShape() {
        Rectangle r1 = new Rectangle(5, 6, "Ba", "RED", "GREEN");
        Shape r2 = new Rectangle(6, 6, "Ba2", "RED2", "GREEN2");
        Disk d1 = new Disk(2, "Ma", "PINK", "YELLOW");
        Shape d2 = new Disk(3, "Ma2", "PINK2", "YELLOW2");
        Shape s1 = new Square(5, "OngCo", "Black", "Pink");
        Shape t1 = new RightTriangle(3, 4, "Tui", "Black", "Red");

        Shape[] x = new Shape[]{r1, r2, d1, d2, s1, t1};
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[j].getArea() < x[i].getArea()) {
                    Shape tmp = x[j];
                    x[j] = x[i];
                    x[i] = tmp;
                }
            }
        }
        for (Shape shape : x) {
            shape.paint();
        }

    }
}

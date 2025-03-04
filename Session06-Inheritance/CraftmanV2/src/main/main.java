package main;

import Craftman.Disk;
import Craftman.Rectangle;
import Craftman.RightTriangle;
import Craftman.Square;
import Craftman.Triangle;
import java.util.Scanner;


public class main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) { 
        playWithTriangle();
                
    }
    
    public static void softShapes() {
        Rectangle r1 = new Rectangle("Tia", "PINK", 1.0, 2.0);
        Rectangle[] rectArr = new Rectangle[10];
        rectArr[0] = r1;
        rectArr[0].setOwner("Tia yeu!!");
        r1.paint();
        rectArr[1] = new Square("Thuan", "Rainbow", 2.0);
    }
    
    public static void playWithTriangle() {
        Triangle t1 = new Triangle("Tia", "PINK", 3, 4, 5);
        t1.paint();
        Triangle t2 = new RightTriangle("Ma", "RED", 6, 8);
        t2.paint();
    }
    
    public static void playWithChildClass() {
        Square s1 = new Square("Con", "pink", 3.0);
        s1.paint();
        Rectangle r1 = new Rectangle("Tia", "Yellow", 4.0, 5.0);
        r1.paint();
        Rectangle r2 = new Square("Me", "Red", 4.0);
        r2.paint();
    }
    
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("Tia", "PINK", 1.0, 2.0);
        r1.paint();       
        Square s1 = new Square("Ma", "RED", 3.0);
        s1.paint();
        Disk d1 = new Disk("Anh", "BLUE", ":)", 2.0);
        d1.paint();
        
        
    }
}

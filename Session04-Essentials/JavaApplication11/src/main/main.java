package main;

import Craftman.Disk;
import Craftman.Rectangle;
import Craftman.Square;


public class main {
    public static void main(String[] args) {
        softShapes();
        
    }
    
    public static void softShapes() {
        Rectangle r1 = new Rectangle("Tia", "PINK", 1.0, 2.0);
        Rectangle[] rectArr = new Rectangle[10];
        rectArr[0] = r1;
        rectArr[0].setOwner("Tia yeu!!");
        r1.paint();
        rectArr[1] = new Square("Thuan", "Rainbow", 2.0);
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

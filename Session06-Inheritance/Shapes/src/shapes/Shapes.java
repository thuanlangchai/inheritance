package shapes;

import data.*;

public class Shapes {

    
    public static void main(String[] args) {
       sortShapes();
       
    }
    
    public static Shape playWithAnonymousClass() {
        return new Shape("vangLai", "Black", "Pink") {
            @Override
            public double getArea() {
                return 45;
            }
            
            @Override
            public double getPerimeter() {
                return 15;
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|  - |  - |%7.2f|\n",
                                   "ME", owener, color, borderColor, getArea());
            }           
        };
    }
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("Tia", "Pink", "Magenta", 5.0, 6.0);
        Shape r2 = new Rectangle("Tia", "Pink", "Magenta", 6.0, 5.0);
        
        Square s1 = new Square("Ma", "Pink", "Magenta", 7.0);
        Rectangle s2 = new Square("Ma", "Pink", "Magenta", 8.0);
        Shape s3 = new Square("Ma", "Pink", "Magenta", 9.0);
        Disk d1 = new Disk("Be Na", "Rainbow", "Rainbow", 2.0);
        Disk d2 = new Disk("Ghe Be Na", "Rainbow", "Rainbow", 1.0);
        
        
                
        Shape[] arr = new Shape[]{r1, r2, s1, s2, s3, d1, d2, playWithAnonymousClass()};
        
        System.out.println("The list of Shapes is: ");
        for (Shape shape : arr) {
            shape.paint();
        }
        
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
        System.out.println("The list of Shapes after sorting is: ");  
        for (Shape shape : arr) 
            shape.paint();
                    
    }

    
    
}

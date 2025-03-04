package thuan.main;

import thuan.util.MyToys;


public class Stage {
    public static void main(String[] args) {
        //System.out.println("PI is: " + MyToys.PI); 
        
        int length = MyToys.getAnInteger("Input Length: ");
        
        int width = MyToys.getAnInteger("Input Width: ");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        
    }
}

package main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        Student x = checkObject3();
        x.showProflie();
        x.setName("Minh Thuan");
        x.showProflie();
        checkObject3().showProflie();
    }

    
    public static Student checkObject3() {       
        return new Student("SE666789", "AN NGUYEN", 1999, 8.9);
    }
    
    
    // kiểm tra việc new trùng thông tin xem sao?
    public static void checkObject2() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        Student p = s1;
        new Student("SE666789", "AN NGUYEN", 1999, 8.9).showProflie();
        
        
        //p.setName("MInh Thuan");
        
        //s1 = new Student("SE666788", "BINH LE", 1998, 8.8);
        s1.showProflie();
        p.showProflie();
         
        
    }
    
    public static void checkObject1() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        
        Student s2 = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        s1.setName("Ngoc Tinh");
        
        
        s1.showProflie();       
        s2.showProflie();
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void checkObject() {
        Student an = new Student("SE666789", "AN NGUYEN", 1999, 8.9);
        System.gc();

        an.showProflie();
//        new là clone vùng ram, chứa info sẽ đổ vào 
//        gọi phễu đổ vào clone 
//        chốt lại tọa độ vùng new
//        an = new Student("SE6667789", "RICH BOY", 2001, 9.9);
 //       an.showProflie();

    }
}

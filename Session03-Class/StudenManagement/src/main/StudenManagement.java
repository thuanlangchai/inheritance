 package main;

import data.Shelf;
import data.Student;




public class StudenManagement {

    
    public static void main(String[] args) {
        Shelf hoSoA = new Shelf("red", "ban cong nghe");
        hoSoA.inputStudent();
        hoSoA.inputStudent();
        hoSoA.printStudentList();
    }
    
   
}

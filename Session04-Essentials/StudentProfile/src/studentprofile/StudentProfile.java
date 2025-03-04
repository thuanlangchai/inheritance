package studentprofile;

import java.util.Scanner;

public class StudentProfile {
    
    public static void main(String[] args) {
        inputProfile();
    }
    
    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Input yob: ");
//        yob = sc.nextInt();
//        sc.nextLine();
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Here is your profile: ");
        
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
                                 
        
    }
    
    
    
    
    
}

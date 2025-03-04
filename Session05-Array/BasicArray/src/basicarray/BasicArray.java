package basicarray;

import java.util.Scanner;

public class BasicArray {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        softObjectArray();
        
       
    }
    
    
    public static void softObjectArray() {
        Student[] arr = new Student[5];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = inputStudent();
        
        System.out.println("The arr list before softing");
        for (Student x : arr) 
            x.showProfile();
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr.length; j++) 
                if(arr[i].getGpa() > arr[j].getGpa()){
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
        System.out.println("The arr list after softing");            
        for (Student x : arr) 
            x.showProfile();
        
        
    }
    
    public static void playWithPrimitiveArrayV4() {
        Student[] profile = new Student[5];
        //profile[0] = new Student("SE123456", "Ngoc Tinh", 2006, 10);
        //profile[1] = new Student("SE654321", "Minh Thuan", 2006, 10);
        for (int i = 0; i < profile.length; i++) {
            System.out.println("Please input in4 profile[" + i + "]: ");          
            profile[i] = inputStudent();
        }
        for (Student student : profile) {
            System.out.println(student);
        }
    }
    
    public static Student inputStudent() {
        System.out.print("Input id: ");
        String a = sc.nextLine();
        System.out.print("Input name: ");
        String b = sc.nextLine();
        System.out.print("Input yob: ");
        int c = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        double d = sc.nextDouble();
        sc.nextLine();
        return new Student(a, b, c, d);
    }
    
    
    public static void playWithPrimitiveArrayV3() {
        int[] arr1 = {5, 10, 15, 20, 25};
        
        int[] arr2 = new int[]{5, 10, 15, 20, 25};
        
        int[] arr3;
        arr3 = new int[5];
        
        int[] arr = new int[5];
        System.out.println("The arr has: ");
        for (int i : arr) 
            System.out.print(i + " ");
        System.out.println("The array has: " + arr);
        
           
    }
    
    public static void playWithPrimitiveArrayV2() {
    //    float* arr = calloc(7, sizeof(float));
        double arr[] = new double[50];
        arr[0] = 5;
        System.out.println("The array has value of");
        for (double d : arr) 
            System.out.print(d + " ");
        
        System.out.println("\nThe array has value of");
        for (int i = 0; i < arr.length; i++) 
             System.out.print(arr[i] + " ");
            
        
        
    }
    
    public static void playWithPrimitiveArray() {
        double v[] = {1, 2, 3, 4, 5, 6};
       
        v[0] = 2907;
        for (int i = 0; i < 6; i++) 
            System.out.print(v[i] + " ");
        System.out.println("");
        System.out.println("The array has values of (printed by using for each)");
        for (double d : v) {
            System.out.print(d + " ");
        }
        
            
    }
}
           
                         
        
               
            
            
            
        
    
       
        
    


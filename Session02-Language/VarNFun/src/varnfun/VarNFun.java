package varnfun;

import java.util.Scanner;



   public class VarNFun {
    public static void main(String[] args) {
        int n;
        n = getAPositiveInteger();
        System.out.println("Your name: " + n);
        printIntegerList(n);
    }
    
       public static int getAPositiveInteger() {
           int n;        
           Scanner banPhimCuaTui = new Scanner(System.in);
           System.out.println("Input a positive number: ");
           n = banPhimCuaTui.nextInt();
        return n;                                                                         
       }
    
    
    public static void printIntegerList(int n) {
           System.out.println("The list of " + n + " first integers");
           for (int i = 1; i <= n; i++) {
               System.out.print(i + " ");              
           }
           System.out.println("");
       }
    
    public static void printIntegerList(){
        System.out.println("The list of 100 first integers:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

    }


    public static void playWithBoolean(){
        boolean marriedStatus = true;
        if (marriedStatus) 
            System.out.println("dung vai ca lon");
        else 
            System.out.println("ngu");
        System.out.println("dot nua");

    
}


    public static void playWithCharacters(){
        char unit = '$';
        System.out.println("unit: " + unit);

        String name = "Nguyen Minh Thuan";
        System.out.println("name: " + name);
        System.out.println("1st letter in my name: " + name.charAt(0));
        System.out.println("my name as in lowercase: " + name.toLowerCase());

    }


    public static void playWithDouble(){
        double pi = 3.14;
        System.out.println("Pi: " + pi);

        float vat = 0.1F; 
        System.out.println("Vat: " + vat);  


    }


    public static void playWithIntegers(){
        int age = 25;
        long money = 3_500_000_000L;
        System.out.println("Money: " + money);
        int status = 0xFA;
        System.out.println("status: " + status);
        int phone = 070;
        System.out.println("Phone: " + phone);

    }


    public static void playWithVariable() {
        //int a = 39, b;
        //b = 79;
        int yob = 2006;
        int age = 2024 - yob;
        System.out.println("Your age: " + age + " years old");
        System.out.println("Your age is " + (2024 - yob) + " years old");
    }
}







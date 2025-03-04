package thuan.util;

import java.util.Scanner;


public class MyToys {
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENTS = 500;
    private static Scanner sc = new Scanner(System.in);
    
    
    
    
    public static int getAnInteger(String Msg) {
        int n ;               
        do {
            try {
                System.out.print(Msg);
                //n = sc.nextInt();
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input again");
            }
        } while(true);
    }
}

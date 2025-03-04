package main;

import data.*;

public class quanLySInhVien {
    public static void main(String[] args) {
        managementSinhVien();
    }

    public static void managementSinhVien() {
        Students s1 = new Students("Thuan", 18, 9.5);
        run[] x = new run[2];
        x[0] = new Students("thuan", 54, 10);
        ((Students)x[0]).showProfiles();
    } 

    public static void run() {
        System.out.printf("OFF");
    }
}

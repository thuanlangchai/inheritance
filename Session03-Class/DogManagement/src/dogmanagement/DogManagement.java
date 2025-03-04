package dogmanagement;

import data.Dog;
import java.util.Scanner;


public class DogManagement {

    public static void main(String[] args) {
        int age;       
        Dog chiHu = new Dog("CHIHUHU", 2021, 0.5);
        chiHu.bark();
        Dog ngaoDa = new Dog("ngaoDa", 2022, 2.5);
        ngaoDa.bark();
        System.out.println("chHuHu bark again");
        chiHu.bark();    
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        System.out.println("ngaoDa YOB: " + ngaoDa.getYob());
        chiHu.setWeight(5.0);
        System.out.println("after overweight during online: ");
        ngaoDa.setWeight(3.0);
        chiHu.bark();
        ngaoDa.bark();
    }
    
    
}

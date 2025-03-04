package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Arrays;
import java.util.Random;

public class AmazingRace {
    private static Random rd = new Random();
    
    public static void main(String[] args) {
       sortPetOfSpeed();
       
    }
    
    public static void sortPetOfSpeed() {
        Pet[] p = new Pet[5];
        p[0] = new Dog("Ngao", 18, 3.1);
        p[1] = new Cat("Miu", 16, 2.2);
        p[2] = new Hamster("Chit", 8, 1.1);
        p[3] = new Dog("Vang", 14, 3.3);
        p[4] = new Pet("Khonhapro", 222, 111) {   
            int tmp;
            @Override
            public int run() {
               tmp = rd.nextInt(50);
               return tmp;
            }
            
            @Override
            public void showRecord() {
                System.out.println("My speed is of " + name + " is " + tmp);
            }
        };
        
        double[] tmp = new double[p.length];
        for (int i = 0; i < p.length; i++) 
            tmp[i] = p[i].run();
        
        for (Pet pet : p) {
            pet.showRecord();
        }
        
        Arrays.sort(tmp);
        
        System.out.println("After sort is: ");
        for (double pet : tmp) {
            System.out.println("My speed is " + pet);
        }    
        
    }
}

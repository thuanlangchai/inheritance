package amazingrace2;

import data.*;




public class AmazingRace2 {
   
    
    public static void main(String[] args) {
       showRecord();
    }
    
    
    public static void showRecord() {
        Pet[] racer = new Pet[] {new Dog("CHIHUHU", 2021, 0.5),
                                 new Dog("VANG", 1950, 10),
                                 new Cat("TOM", 1960, 15),
                                 new Cat("KITTY", 1990, 0.5),
                                 new Hamster("CHERRY", 1960, 0.5),
                                 new Hamster("NHAT", 2021, 0.3)
                                };
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }
    }
}

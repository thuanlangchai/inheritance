package amazingracev2;
import data.*;

public class AmazingRaceV2 {
    
    
    public static void main(String[] args) {
        DeathRace();
    }
    
    public static void DeathRace() {
        Dog d1 = new Dog("CHIHUHU", 2021, 50);
        Pet d2 = new Dog("VANG OI", 1950, 10);
        DeathRace d3 = new Dog("NGAO DA", 1901, 20.0);
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRace m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");

        DeathRace[] racer = new DeathRace[] {d1, (Dog)d2, d3, m1, m2};
        

        for (DeathRace deathRace : racer) {
            deathRace.showHowToDead();
        }
    }
}

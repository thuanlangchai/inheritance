package data;


public class Cat extends Pet {
    public static final double MAX_SPEED = 40;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    @Override
    public double run() {
        return Motor.rd.nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                           "CAT", name, yob, weight, run());
    }

}

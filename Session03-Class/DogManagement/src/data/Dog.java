package data;

public class Dog {
    private String name;
    private int yob;
    private double weight;
    
    public Dog(String iname, int iyob, double iweight) {
        name = iname;
        yob = iyob;
        weight = iweight;
    }
    
    public void bark() {
        //System.out.println("gaugaugaugau, my name is " + name);
        //System.out.println("gaugaugaugau, my yob is " + yob);
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n", name, yob, weight);
        
    }
    
    public int getYob() {
        return yob;
    }
    
    public void setWeight(double newWeight) {
        weight = newWeight;
    }
    
}






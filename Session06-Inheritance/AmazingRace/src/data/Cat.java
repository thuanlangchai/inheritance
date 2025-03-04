package data;


public class Cat extends Dog {
    public static final int MAX_SPEED2 = 40;
    public Cat(String name, int old, double weight) {
        super(name, old, weight);
    }
       
    @Override
    public int run() {        
        tmp = rd.nextInt(MAX_SPEED2);
        return tmp;
    }    
    
}

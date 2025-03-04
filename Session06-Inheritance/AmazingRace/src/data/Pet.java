package data;

public abstract class Pet {
    protected String name;
    protected int old;
    protected double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Pet(String name, int old, double weight) {
        this.name = name;
        this.old = old;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", old=" + old + ", weight=" + weight + '}';
    }
    
    
    public abstract int run();
    public abstract void showRecord();
}

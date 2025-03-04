package data;

public class Students extends People implements run, jump  {
    private double GPA;
    public Students(String name, int age, double GPA) {
        super(name, age);
        this.GPA = GPA;
    }

    @Override
    public void showProfiles() {
        super.showProfiles();
        System.out.println(" " + GPA);
    }

    @Override
    public double run() {
        return 1;
    }

    @Override
    public double jump() {
        return 2;
    }
}

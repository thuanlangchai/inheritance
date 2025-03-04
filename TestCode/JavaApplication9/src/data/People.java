package data;

public abstract class People {
    protected String name;
    protected int age;

    public People(String name, int age) {
        this.age = age;
        this.name = name;
    }
    
    //public abstract void run();
    public void showProfiles() {
        System.out.print(name + ' ' + age + ' ');
    }
}

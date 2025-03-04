package data;

public class cat implements run, jump {
    @Override
    public double run() {
        return 2;
    }

    @Override
    public double jump() {
        return 3;
    }
}

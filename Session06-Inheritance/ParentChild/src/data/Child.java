package data;


public class Child extends Parent{
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void showProfiles() {
        System.out.println("CHILD  > " + "asset1: " + assetOne + "; asset2: " + assetTwo);
    }
    
    public void sayHi() {
        System.out.println("Hi i'm Dad");
    }
    
}

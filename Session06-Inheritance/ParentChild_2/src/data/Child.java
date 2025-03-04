package data;


public class Child extends Parent{
    private String assetThree;

    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    
    @Override
    public void showProfiles() {
        System.out.println("CHILD > " + "asset1: " + assetOne + "; asset2: " + assetTwo
                            + "asset3: " + assetThree);
    }
    
    public void sayHi() {
        System.out.println("Hi i'm son");
        System.out.println("I have asset3 is " + assetThree);
    }
}

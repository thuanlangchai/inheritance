package data;


public class Square extends Rectangle{
    public Square(double a, String owner, String color, String boderColor) {
        super(a, a, owner, color, boderColor);
    }
     
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s| - |%4.1f|%7.2f|\n",
                            owner, color, boderColor, a,getArea());
    }

   public void sayHi() {
       System.out.println("I am nephew");
   }
    
    
    
    
}

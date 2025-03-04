
package parentchild;

import data.Child;
import data.Parent;


public class ParentChild {

    
    public static void main(String[] args) {
        playWithParent();
        
    }
    
    public static void playWithParent() {
        Parent p1 = new Parent("Biet Thu", "1000BTC");
        p1.showProfiles();
        Child c1 = new Child("Nha Pho", "2000BTC");
        c1.showProfiles();
        c1.sayHi();
        Parent p2 = new Child("Can Ho", "3000BTC");
        p2.sayHi();
    }
    
}

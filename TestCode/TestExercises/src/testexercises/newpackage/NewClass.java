package testexercises.newpackage;


public class NewClass {
        private String name;
        private int age;
        private double height;
        
        public NewClass (String iName, int iAge, double iHeight) {
            name = iName;
            age = iAge;
            height = iHeight;           
        }
        public void person() {
            System.out.println("person in4: " + name + " " + age + " " + height);
        }
                              
}

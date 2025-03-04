package data;

import java.util.Scanner;

public class Shelf {
    private String color;
    private String label;
    private Student[] listStudent = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0;
    
    
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }
    public void inputStudent() {
        System.out.println("Input Student #" + (count + 1) + "/" + listStudent.length);
        System.out.print("Input id: ");
        String a = sc.nextLine();
        System.out.print("Input name: ");
        String b = sc.nextLine();
        System.out.print("Input yob: ");
        int c = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        double d = sc.nextDouble();
        sc.nextLine();
        listStudent[count] = new Student(a, b, c, d);
        count++;
    }
    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            listStudent[i].showProflie();
        }
    }
}

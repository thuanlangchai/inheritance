package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        //inputProfile();
        inputProfileVip();
    }

    public static void inputProfileVip() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (69 < 79) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("do you know how to input a positive number?");
                //yob = 69;
            }
        }

        

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Here is your profile: ");

        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        try {
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        System.out.println("Here is your profile: ");

        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

}

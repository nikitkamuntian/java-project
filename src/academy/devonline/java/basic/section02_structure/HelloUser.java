package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Enter username:");

        String s = new Scanner(System.in).nextLine();
        System.out.println("Hello," + s);
    }
}

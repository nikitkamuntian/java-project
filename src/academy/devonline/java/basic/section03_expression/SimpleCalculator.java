package academy.devonline.java.basic.section03_expression;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter a var:");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter b var:");
        var b = new Scanner(System.in).nextInt();

        System.out.println("A + B = " + a + b);
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + a * b);
        System.out.println("A / B = " + a / b);
        System.out.println("A % B = " + a % b);
    }
}

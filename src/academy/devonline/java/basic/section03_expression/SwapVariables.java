package academy.devonline.java.basic.section03_expression;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        var hui = a;
        a = b;
        b = hui;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

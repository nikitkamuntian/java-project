package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class SimpleCaluculator {
    public static void main(String[] args) {
        System.out.println("Enter 'A':");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'B':");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Enter operator: (+,-,*,/,%)");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        String result;
        if (operator == '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a-b=" + (a - b);
        } else if (operator == '*') {
            result = "a*b=" + (a * b);
        } else if (operator == '/') {
            result = "a/b=" + (a / b);
        } else if (operator == '%') {
            result = "a%b=" + (a % b);
        } else {
            result = "Unsupported operator" + operator;
        }
        System.out.println(result);
    }
}

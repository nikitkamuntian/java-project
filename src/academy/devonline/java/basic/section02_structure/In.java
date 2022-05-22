package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class In {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        System.out.println(a);

        var b = new Scanner(System.in).nextDouble();
        System.out.println(b);

        var ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println(ch);

        var s = new Scanner(System.in).nextLine();
        System.out.println(s);
    }
}

package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class StructureOfAnyConsProgram {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        var result = a + b *5 -7*a;
        System.out.println(result);
    }
}

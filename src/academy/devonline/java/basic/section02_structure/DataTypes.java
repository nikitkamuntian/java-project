package academy.devonline.java.basic.section02_structure;

import java.util.Calendar;

public class DataTypes {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(Integer.MIN_VALUE + " < " + i + " < " + Integer.MAX_VALUE);

        double d = 0.1;
        System.out.println();
        System.out.println(Double.MIN_VALUE + " < " + i + " < " + Double.MAX_VALUE);

        boolean b1 = true;
        boolean b2 = false;

        char ch = 'a';
        System.out.println(Character.MIN_VALUE + " < " + ch + "(" + (int) ch + ") < "+ Character.MAX_VALUE);

        String s = "Hello World";
        System.out.println(s);
    }
}

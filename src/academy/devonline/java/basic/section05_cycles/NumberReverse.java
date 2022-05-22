package academy.devonline.java.basic.section05_cycles;

import java.util.Enumeration;

public class NumberReverse {
    public static void main(String[] args) {
        var a = 123456789;

        var result = 0;
        var temp = a;

        while (temp != 0){
            var digit = temp % 10;
            result=result*10+digit;
            temp/=10;
        }
        System.out.println("Reverse number: " + result);

    }
}

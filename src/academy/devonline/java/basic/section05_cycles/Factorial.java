package academy.devonline.java.basic.section05_cycles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        var value = new Scanner(System.in).nextInt();

        String finalresult;
        if (value < 0) {
            finalresult = "value >= 0";
        } else {
            var result = 1;
            for (var i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalresult = result == 0 ? "int overflow" : String.valueOf(result);
        }
        System.out.println(finalresult);
    }
}
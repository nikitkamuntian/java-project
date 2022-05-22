package academy.devonline.java.basic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            if (i==5) {
                break;
            }
        }

        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " ");
        }
        System.out.println();



        var number = new Random().nextInt(10);
        var guessend = false;

        for (int i = 0; i < 10; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("number>" + userCase);
            } else if (number < userCase){
                System.out.println("number<");
            } else {
                guessend =true;
                System.out.println("ok");
                break;
            }
        }
        if (!guessend){
            System.out.println("Limit");
        }
    }
}

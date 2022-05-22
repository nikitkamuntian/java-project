package academy.devonline.java.basic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        while (true) {
            var userCase = new Scanner(System.in).nextInt();

            if (number > userCase) {
                System.out.println("number>" + userCase);
            } else if (number < userCase){
                    System.out.println("number<");
                }
                else {
                System.out.println("ok");
                    break;
            }
        }
    }
}

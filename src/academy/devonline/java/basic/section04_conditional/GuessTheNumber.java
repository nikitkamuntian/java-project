package academy.devonline.java.basic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        var a = new Scanner(System.in).nextInt();

        String result;
        if (number == a) {
            result = "Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }
        System.out.println(number == a ? "Congratulations, you guessed the number!":"Sorry, but your number is invalid! Try again later...");
    }
}

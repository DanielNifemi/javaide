package tdd;


import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {

    public static void main(String[] args){
        int answer , guess;

        final int MAX = 100;

        Scanner input = new Scanner(System.in);

        Random number = new Random();

        boolean correct = false;


        answer = number.nextInt(MAX) + 1;

        while (! correct) {
            System.out.println("Guess a number between one an hundred:");

            guess = input.nextInt();


            if (guess > answer) {
                System.out.println("too high");
            }
            else if (guess < answer) {
                System.out.println("too low");
            }
            else {
                System.out.println("your guess is correct");
                correct = true;
            }
        }
        System.exit(0);
    }

}

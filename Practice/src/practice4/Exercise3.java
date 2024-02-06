package practice4;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int numberToGuess;
    private int maxTries;
    private int currentTry;
    private boolean hasWon;

    public Game(int maxTries) {
        this.maxTries = maxTries;
        this.currentTry = 0;
        this.hasWon = false;
        Random random = new Random();
        this.numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        while (currentTry < maxTries && !hasWon) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            currentTry++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                hasWon = true;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly in " + currentTry + " tries!");
        } else {
            System.out.println("Sorry, you've run out of tries. The number I was thinking of was: " + numberToGuess);
        }

        scanner.close();
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Game game = new Game(5); // Allow 5 tries
        game.play();
    }
}

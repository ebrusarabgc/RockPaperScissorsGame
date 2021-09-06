package Homeworks;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int compScore = 0;

        System.out.println("Let's play rock paper scissors!");

        while (userScore < 3 && compScore < 3) {
            System.out.println("Rock, paper or scissors?");

            String userChoice = scanner.next();
            userChoice = userChoice.toLowerCase(); // So even though it is written in different ways (like ROCK, rock and Rock), it will be treated in the same way.

            int compChoice = random.nextInt(3) + 1;
            // 1--> Rock, 2--> Paper, 3--> Scissors

            switch (userChoice) {
                case "rock":
                    if (compChoice == 1) {
                        System.out.println("My choice was rock too. It's a draw.");
                    } else if (compChoice == 2) {
                        System.out.println("My choice was paper. I won!");
                        compScore += 1;
                    } else {
                        System.out.println("My choice was scissors. You won...");
                        userScore += 1;
                    }
                    break;
                case "paper":
                    if (compChoice == 1) {
                        System.out.println("My choice was rock. You won...");
                        userScore += 1;
                    } else if (compChoice == 2) {
                        System.out.println("My choice was paper too. It's a draw.");
                    } else {
                        System.out.println("My choice was scissors. I won!");
                        compScore += 1;
                    }
                    break;
                case "scissors":
                    if (compChoice == 1) {
                        System.out.println("My choice was rock. I won!");
                        compScore += 1;
                    } else if (compChoice == 2) {
                        System.out.println("My choice was paper. You won...");
                        userScore += 1;
                    } else {
                        System.out.println("My choice was scissors too. It's a draw.");
                    }
                    break;
                default:
                    System.out.println("Please make a valid choice...");
                    break;
            }

            System.out.println("My score = " + compScore + ", Your score = " + userScore);
        }

        if (compScore == 3) {
            System.out.println("I won!");
        } else {
            System.out.println("You won...");
        }

    }
}

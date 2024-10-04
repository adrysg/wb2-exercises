package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String userScores = PromptForString("Please enter a game score: ");

        int indexOfBar = userScores.indexOf("|");

        String scoresString = userScores.substring(indexOfBar + 1);

        String[] scores = scoresString.split(Pattern.quote(":"));

        int leftScore = Integer.parseInt(scores[0]);
        int rightScore = Integer.parseInt(scores[1]);

        boolean isLeftWinner = (leftScore > rightScore);
        String teamNameString = userScores.substring(0, indexOfBar);
        String[] teamNames = teamNameString.split(Pattern.quote(";"));

        if (isLeftWinner) {
            System.out.println(teamNames[0] + "Wins!");
        }
        else {
            boolean isRIghtWinner = (rightScore > leftScore);
            if (isRIghtWinner) {
                System.out.println(teamNames[1] + "Wins!");
            } else {
                System.out.println("It's a tie! ");
            }
        }

            System.out.println(userScores);
            System.out.println(leftScore);
            System.out.println(rightScore);
        }
        public static String PromptForString (String prompt){
            System.out.print(prompt);
            return scanner.nextLine().trim();
        }
    }
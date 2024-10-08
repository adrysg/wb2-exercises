package com.pluralsight;

public class Main {

    public static void main(String[] args)
    {
//Create an instance of Dice named "dice"
        Dice dice = new Dice();

//Identify variables for rolls 1 & 2
        int roll1;
        int roll2;

//Identify variables to count rolls resulting in 2, 4, 6, & 7
        int counterFor2 = 0;
        int counterFor4 = 0;
        int counterFor6 = 0;
        int counterFor7 = 0;

//Create a loop that runs 100x, call the roll method two times
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

//Display the value of each roll
            System.out.println("Roll " + (i+1) + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

//Implement counters for rolls resulting in 2, 4, 6, & 7
            if(sum == 2) {
                counterFor2++;
            }
            if(sum == 4){
                counterFor4++;
            }
            if(sum == 6){
                counterFor6++;
            }
            if(sum == 7){
                counterFor7++;
            }
        }
//Display counters
        System.out.println("Counter for 2: " + counterFor2);
        System.out.println("Counter for 4: " + counterFor4);
        System.out.println("Counter for 6: " + counterFor6);
        System.out.println("Counter for 7: " + counterFor7);
    }
}

package com.pluralsight;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Create an array of 10 test scores

        int[] testScores = {90, 85, 87, 72, 78, 98, 68, 82, 65, 92};

//Get length of the array
        int length = testScores.length;

//Calculate array sum, create variables for high and low score
        int sum = 0;
        int highScore = 0;
        int lowScore = 100;

//Using "for" loop and "if" statements to calculate the sum, high and low scores
        for (int i = 0; i < testScores.length; i++) {

            if(testScores[i] > highScore){
                highScore = testScores[i];
            } if(testScores[i] < lowScore){
                lowScore = testScores[i];
            }
            sum += testScores[i];
        }
//Calculate array average
        double average = (double) sum / length;

//calculate array median

        double median = median(testScores, length);
        double difference = average - median;

//Display the results
        System.out.println("Average value: " + average);
        System.out.println("Highest score: " + highScore);
        System.out.println("Lowest score: " + lowScore);
        System.out.println("Median value: " + median);
        System.out.println("Median and Average difference: " + difference);
    }

    public static double median(int testScores[], int length) {
        Arrays.sort(testScores);
        if (length % 2 != 0) {
            return testScores[length / 2];
        } else {
            return (double) (testScores[(length - 1) / 2] + testScores[length / 2]) / 2;
        }
    }
}

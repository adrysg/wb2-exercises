package com.pluralsight;

public class LoopingExercises {

    public static void main(String[] args) throws InterruptedException
    {
//declare variable
        int i = 1;

//using whileLoop to display text 5x

        while (i < 6){

            System.out.println("I love Java");
            i++;
        }

//using these dashes to separate both outputs

        System.out.println("--------------------");

// using the do/whileLoop to display text 5x

        i = 1;
        do {
            System.out.println("I love Java (Do)");
            i++;
        } while (i < 6);

//using these dashes to separate both outputs

        System.out.println("--------------------");

//Using the forLoop to countdown from 10 to 1

        for (int a = 10; a >= 1; a--)
        {
            System.out.println(a);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");

    }
}

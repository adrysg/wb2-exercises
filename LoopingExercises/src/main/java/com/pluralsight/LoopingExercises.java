package com.pluralsight;

public class LoopingExercises {

    public static void main(String[] args) throws InterruptedException
    {
//declare variable
        int i = 1;

//introduce expression using while statement

        while (i < 6){

            System.out.println("I love Java");
            i++;
        }

//using these dashes to separate both outputs

        System.out.println("--------------------");

// using the do/while statement
        i = 1;
        do {
            System.out.println("I love Java (Do)");
            i++;
        } while (i < 6);

        for (int a = 10; a >= 0; a--)
        {
            System.out.println(a);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");




    }
}

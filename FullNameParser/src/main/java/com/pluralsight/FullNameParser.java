package com.pluralsight;
import java.util.*;

public class FullNameParser {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//declare variables

        String fullName = PromptForString("Please enter your FULL name: ");

        //full name would be "Matt W Christenson"
        //                    01234

        int indexOfFirstSpace = fullName.indexOf(' ');

        //woudl be 4

        String firstName = fullName.substring(0, indexOfFirstSpace);
         // would be "Matt"
        String endingPart = fullName.substring(indexOfFirstSpace + 1);
        //ending part is now "W Christenson"
        //                    01


        int indexOfSpaceInEndingPart = endingPart.indexOf(" ");

        //this is 1
        String middleName;
        String lastName;
        //String lastName = fullName.substring(1+ indexOfFirstSpace + indexOfSpaceInEndingPart);

        if (indexOfSpaceInEndingPart < 0){
            middleName = "";
            lastName = endingPart;
        } else {
            middleName = endingPart.substring(0,indexOfSpaceInEndingPart);
            lastName = endingPart.substring(indexOfSpaceInEndingPart + 1);
        }

//display

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }

    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();

    }
}
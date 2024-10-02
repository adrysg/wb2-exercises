package com.pluralsight;
import java.util.*;

public class FullNameApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String firstName = PromptForString("First name: ");
        String middleName = PromptForString("Middle name: ");
        String lastName = PromptForString("Last name: ");
        String suffix = PromptForString("Suffix: ");
        
        String fullName;

        middleName = (middleName.isBlank()) ? " " : " " + middleName + " ";
        suffix = (suffix.isBlank()) ? " " : ", " + suffix;

        fullName = firstName + middleName +  lastName + suffix;

        System.out.println("Hello " + fullName);
    }

    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return FullNameApplication.scanner.nextLine().trim();
    }
}

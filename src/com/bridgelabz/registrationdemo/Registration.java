package com.bridgelabz.registrationdemo;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
    static Scanner input = new Scanner(System.in);

    // First name validation first name starts with Caps
    public void firstNameValidation() {
        System.out.println("Enter your First Name ");
        String firstName = input.next();
        if (Pattern.matches("^[A-Z][A-Za-z]{2,}$", firstName)) {
        } else {
            System.out.println(
                    "Invalid format for First Name it should start with minimum One Caps re-enter your first name");
            firstNameValidation();
        }
    }

    // Last name validation last name starts with Caps
    public void lastNameValidation() {
        System.out.println("Enter your last Name ");
        String lastName = input.next();
        if (Pattern.matches("^[A-Z][A-Za-z]{2,}$", lastName)) {
        } else {
            System.out.println(
                    "Invalid format for Last Name it should start with minimum One Caps re-enter your last name");
            lastNameValidation();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome for Registration");
        Registration validation = new Registration();
        validation.firstNameValidation();
        validation.lastNameValidation();
    }

}
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
    // Email validation
    public void EmailAddressValidation() {
        System.out.println("Enter your email id: ");
        String email = input.next();
        if (Pattern.matches("^[a-z\\+\\-\\_\\.a-z0-9]{3,}\\@[a-z]*\\.[a-z]{1,3}\\.[a-z]{2,3}$", email)) {
        } else {
            System.out.println("Invalid email id re-enter your email id");
            EmailAddressValidation();
        }
    }
    // Mobile Number validation
    public void MobileNumberValidation() {
        System.out.println("Enter your Mobile Number: ");
        String Mobile = input.next();
        if (Pattern.matches("^(\\+91)?[6-9]{1}[0-9]{9}$", Mobile)) {
        } else {
            System.out.println("Invalid Mobile number re-enter your mobile number");
            MobileNumberValidation();
        }
    }
    /*
     * password rule two passed at least one upper case letter,having eight
     * characters and at least one numeric number
     */
    public void passwordRulesValidation() {
        System.out.println("Enter your password: ");
        String password = input.next();
        if (Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)[a-zA-Z0-9\\#]{8,}$", password)) {
        } else {
            System.out.println(
                    "Invalid password format minimum eight characters,one upper case and one numeric number required for passing rule one");
            passwordRulesValidation();
        }
    }
        public static void main (String[]args){
            System.out.println("Welcome for Registration");
            Registration validation = new Registration();
            validation.firstNameValidation();
            validation.lastNameValidation();
            validation.EmailAddressValidation();
            validation.MobileNumberValidation();
            validation.passwordRulesValidation();
        }
}
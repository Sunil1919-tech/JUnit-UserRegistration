package com.bridgelabz;


public class UserMain {
    /**
     * Declaring method main for calling the user inputs for user registration
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Junit User Registration Problem");
        UserRegistration user = new UserValidation();
        user.SelectOption();
    }
}

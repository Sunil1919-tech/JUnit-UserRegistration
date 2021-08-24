package com.bridgelabz;


import java.util.regex.Pattern;

/**
 * User registration using Junit testing
 *
 * @author sunil
 * @version 16.0
 * @since 24/08/2021
 */
public class UserRegistration {
    private Pattern pattern;   //Declaring The Pattern variable as private

    /*
     *Declaring Validate First Name Method
     */
    public boolean validateFirstName(String firstName) {
        //Here Declaring The Name Pattern
        String Name_Pattern = "^[A-Z][a-z]{2,}$"; //The First Letter With Cap And Min 3 Letters
        return pattern.matches(Name_Pattern, firstName);//Matching The Name Pattern And FirstName And Returning It
    }

    /*
     * declaring the lastName Method
     * @param lastName
     * @return boolean value
     */
    public boolean validateLastName(String lastName) {
        //Here Declaring The Name Pattern
        String Name_pattern = "^[A-Z][a-z]{2,}$";//The First Letter With Cap And Min 3 Letters
        return pattern.matches(Name_pattern, lastName);//Matching The Name Pattern And FirstName And Returning It.
    }

}


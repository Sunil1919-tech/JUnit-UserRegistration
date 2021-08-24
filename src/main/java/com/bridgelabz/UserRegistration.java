package com.bridgelabz;


import java.util.regex.Pattern;

public class UserRegistration {
    private Pattern pattern;//Declaring The Pattern variable as private

    //Declaring Validate First Name Method
    public boolean validateFirstName(String firstName) {
        //Here Declaring The Name Pattern
        String Name_Pattern = "^[A-Z][a-z]{2,}$"; //The First Letter With Cap And Min 3 Letters
        return pattern.matches(Name_Pattern, firstName);//Matching The Name Pattern And FirstName And Returning It
    }

}

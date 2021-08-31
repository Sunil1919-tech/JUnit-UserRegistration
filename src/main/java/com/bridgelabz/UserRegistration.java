package com.bridgelabz;


/**
 * User registration using Junit testing
 *
 * @author sunil
 * @version 16.0
 * @since 24/08/2021
 */
public class UserRegistration {

    /*
     Declaring Validate First Name Method
     using the if condition to check enter firstName is valid or not by the user end
     */
    public boolean validateFirstName(String firstName) {
        boolean Validation = firstName.matches("^[A-Z][a-z]{2,}$");
        if (Validation) {
            System.out.println("Entered FirstName is Valid");
        } else {
            System.out.println("Invalid Name \n Enter valid name");
        }
        return Validation;
    }

    /*
     * declaring the lastName Method
     * @param lastName
     * @return boolean value
     */
    public boolean validateLastName(String lastName) {
        boolean Validation = lastName.matches("^[A-Z][a-z]{2,}$");
        if (Validation) {
            System.out.println("Last Name is Valid");
        } else {
            System.out.println("Invalid \n Enter valid Last Name");
        }
        return Validation;
    }

    /*
     *Declaring Valid Email Method
     * using regex pattern for required email format
     */
    public boolean validateEmail(String Email) {
        boolean Validation = Email.matches("^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$");
        if (Validation) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Invalid \n Enter a valid Email");
        }
        return Validation;
    }

    /*
     *declaring ValidateNumber method
     * With country code and 10 numbers
     */
    public boolean validateNum(String PhoneNum) {
        boolean Validation = PhoneNum.matches("^[9][1][ ][1-9][0-9]{9}$");
        if (Validation) {
            System.out.println("Phone number is Valid");
        } else {
            System.out.println("Invalid \n Enter a valid number");
        }
        return Validation;

    }

    /*
     *Declaring validatePassword method
     *with min 8 digits and with one UpperCase ,Numeric values,Spl Characters
     */
    public boolean ValidatePassword(String Password) {
        boolean Validation = Password.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}");
        if (Validation) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Invalid \n Enter Valid Password");
        }
        return Validation;
    }

    public void SelectOption() {

    }
}



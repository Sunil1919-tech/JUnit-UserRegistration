package com.bridgelabz;

//importing the Junit Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * declaring the user registration class
 */
public class UserRegistrationTest {
    //Defining User Registration
    UserRegistration userRegistration = new UserRegistration();

    //Test To Valid FirstName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    //Validation Of First Name And Return True
    public void givenFirstName_Return_True() {
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("Sunil");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertTrue(result);
    }

    //Test To Valid FirstName If It Starts With Small Letter Print False
    @Test
    public void givenFirstName_Return_False() {
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("sunil");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertFalse(result);
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ReturnFalse() {
        boolean result = userRegistration.validateFirstName("Su");
        Assertions.assertFalse(result);
    }
    //Test To Valid LastName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    public void givenLastName_Return_True() {
        //Checking Validate LastName With Pattern And Storing In result
        userRegistration.validateLastName("Reddy");
        boolean result = userRegistration.validateFirstName("Gollaplli");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenLastName_Return_False() {
        //Checking Validate LastName With Pattern And Storing In result
        boolean result = userRegistration.validateLastName("gollapalli");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false, result);
    }
}
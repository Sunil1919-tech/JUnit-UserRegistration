package com.bridgelabz;

//importing the Junit Packages

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * JUnit test to to throw custom Exception
 * declaring the user registration class
 */
public class UserRegistrationTest {
    //Defining User Registration
    UserRegistration userRegistration = new UserRegistration();

    //Test To Valid FirstName Starts With Cap Letter And It Has Min 3 Letters
    //Name Starts with a capital letter
    @Test
    public void givenFirstName_WhenStartsWith_CapitalLetter_ShouldReturn_True() {
        Assertions.assertEquals("valid", UserRegistration.ValidateFirstName("Sunil"));
    }

    // Name contains number
    @Test
    public void givenFirstName_WhenContainsNumber_ShouldReturn_False() {
        Assertions.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateFirstName("Sunil19"));
    }

    //When name does not contain minimum 3 letters
    @Test
    public void givenFirstName_DoNotReturnMinThreeLetters_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateFirstName("Su"));
    }

    // When name starts with small letters
    @Test
    public void givenFirstName_StartsWithSmallLetter_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateFirstName("sunil"));
    }

    // Case For LastName
    //Last Name do not starts with Min three Letters
    @Test
    public void givenLastName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_FIRSTNAME" ,UserRegistration.ValidateLastName("GL"));

    }
    // Last Name start with small letter
    @Test
    public void givenLastName_WhenDoNotStartWithCapitalLetters_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_LASTNAME" ,UserRegistration.ValidateLastName("gollapalli"));
    }

    // Last Name Starts With a Capital Letter
    @Test
    public void givenLastName_WhenStartsWithCapitalLetters_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_LASTNAME" ,UserRegistration.ValidateLastName("Gollapalli"));
    }

    // case For Email

    // Email starts with small letter

    @Test
    public void givenEmail_WhenStartsWithSmallLetter_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_EMAIL" , UserRegistration.Validateemail("sunil19@"));
    }
    //Email starts with Capital letter

    @Test
    public void givenEmail_StartsWithCapitalLetter_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_EMAIL" , UserRegistration.Validateemail("Sunil19@"));
    }

    // email ends with .com

    @Test
    public void  givenEmail_EndsWithComOrIn_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_EMAIL" , UserRegistration.Validateemail("sunil19@gmail.com"));
    }
    // email do not ends with .COM OR IN

    @Test
    public void givenEmail_DoNotEndsWithComOrIn_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_EMAIL" , UserRegistration.Validateemail("sunil9@"));
    }

    //Cases for Mobile Number
    //Phone number followed with country code

    @Test
    public void givenPhoneNumber_WhenFollowedByCountryCode_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_NUMBER" , UserRegistration.ValidatePhoneNumber("91 9676501955"));
    }

    // Number does not contain country code
    @Test
    public void givenPhoneNumber_DoesNotFollowedByCountryCode_ShouldReturnFalse(){
        Assertions.assertEquals("INVALID_NUMBER" ,UserRegistration.ValidatePhoneNumber("6985742135"));
    }

    // Phone Number Does Not have 10 digit number
    @Test
    public void givenPhoneNumber_DoNotHaveTenDigitNumber_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_NUMBER" ,UserRegistration.ValidatePhoneNumber("789456123"));
    }

    // phone num  has 10 digit  number
    @Test
    public void givenPhoneNumber_HasTenDigitNumber_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_NUMBER" ,UserRegistration.ValidatePhoneNumber("9381938400"));
    }
    // Validation of Password
    //Must Contain Minimum 8 Characters

    @Test
    public void givenPassword_IsMinimumEightDigit_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" ,UserRegistration.ValidatePassword("Sunil@123"));
    }
    //Does Not Fulfill The Criteria

    @Test
    public void givenPassword_WhenDoNotContainMinimumEightDigit_ShouldReturnFalse()  {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("Sunil@1"));

    }
    //Case For One UpperCase
    //Password with 1 uppercase
    @Test
    public void givenPassword_WhenContainOneUpperCase_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" , UserRegistration.ValidatePassword("Suni@"));
    }
    // password does not contain any uppercase
    @Test
    public void givenPassword_WhenContainsNoUpperCase_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("suni@"));
    }
    // case for 1 numeric number
    // password contains 1 numeric number
    @Test
    public void givenPassword_WhenContainsOneNumericNumber_ShouldReturnTrue()  {
        Assertions.assertEquals("VALID_PASSWORD" ,UserRegistration.ValidatePassword("Sunil1"));
    }
    //case for no numeric number
    @Test
    public void givenPassword_DoNotContainOneNumericNumber_ReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("Suni@#"));
    }
    // case for One Special Character
//Have  1 special character
    @Test
    public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturnTrue() {
        Assertions.assertEquals("VALID_PASSWORD" ,UserRegistration.ValidatePassword("Suni@"));
    }
    // have no special Character
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturnFalse() {
        Assertions.assertEquals("INVALID_PASSWORD" ,UserRegistration.ValidatePassword("Suni123"));
    }
}
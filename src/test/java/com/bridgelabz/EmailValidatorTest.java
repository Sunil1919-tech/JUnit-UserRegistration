package com.bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;

@RunWith(Parameterized.class)
public class EmailValidatorTest {
    String email;
    boolean expectedResult;
    private UserValidation userValidation;

    public EmailValidatorTest(String email, boolean expectedResult){
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize() {
        userValidation = new UserValidation();
    }
    public static Collections email_With_ExpectedResult() {
        return (Collections) Arrays.asList(new Object[][] {
                { "abc@yahoo.com", true },
                { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true },
                { "abc111@abc.com", true },
                { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true },
                { "abc@1.com", true },
                { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", true },
                { "abc", false },
                { "abc@.com.my", false },
                { "abc123@gmail.a", false },
                { "abc123@.com", false },
                { "abc123@.com.com", false },
                { ".abc@abc.com", false },
                { "abc()*@gmail.com", false },
                { "abc@%*.com", false },
                { "abc..2002@gmail.com", false },
                { "abc.@gmail.com", false },
                { "abc@abc@gmail.com", false },
                { "abc@gmail.com.1a", false },
                { "abc@gmail.com.aa.au", false }
        });
    }

    @Test
    public void testUserEmail() {
        Assertions.assertEquals(expectedResult, userValidation.ValidateEmail(email));
    }
}

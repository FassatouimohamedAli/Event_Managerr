package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEvent {

    private Customer customer;

    @BeforeEach
    public void setUp() {

        customer = new Customer("Fassatoui", "1234567");
    }

    @Test
    public void testLoginSuccess() {

        boolean result = customer.isLogin("Fassatoui", "1234567");
        assertTrue(result, "Login should be successful with correct credentials.");
        //System.out.println("Test result: " + result);
    }
/*
    @Test
    public void testLoginWrongPassword() {

        boolean result = customer.isLogin("Fassatoui", "admin");
        assertFalse(result, "Login should fail with an incorrect password.");
    }

 */

}

package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void whenValidatingPassword_andItsTooShort_returnFalse() {
        var hasValidLength = PasswordValidator.hasValidLength("12345");
        assertFalse(hasValidLength);
    }

    @Test
    public void whenValidatingPassword_andItContainsNoSpecialCharacter_thenReturnFalse() {
        var hasSpecialCharacter = PasswordValidator.hasSpecialCharacter("12345");
        assertFalse(hasSpecialCharacter);
    }

    @Test
    public void whenValidatingPassword_andItContainsSpecialCharacter_thenReturnTrue() {
        var hasSpecialCharacter = PasswordValidator.hasSpecialCharacter("12345%");
        assertTrue(hasSpecialCharacter);
    }
}

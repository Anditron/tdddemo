package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void whenValidatingPassword_andItsTooShort_returnFalse() {
        var hasValidLength = PasswordValidator.hasValidLength("12345");
        assert(hasValidLength == false);
    }

    @Test
    public void whenValidatingPassword_andItContainsNoSpecialCharacter_thenReturnFalse() {
        var hasValidLength = PasswordValidator.hasSpecialCharacter("12345");
        assert(hasValidLength == false);
    }

    @Test
    public void whenValidatingPassword_andItContainsSpecialCharacter_thenReturnTrue() {
        var hasValidLength = PasswordValidator.hasSpecialCharacter("12345%");
        assert(hasValidLength == true);
    }
}

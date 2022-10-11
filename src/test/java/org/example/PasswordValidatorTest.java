package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void whenValidatingPassword_andItsTooShort_returnFalse() {
        // Arrange
        var passwordInput = "12345";

        // Act
        var hasValidLength = PasswordValidator.hasValidLength(passwordInput);

        // Assert
        assertFalse(hasValidLength);
    }

    @Test
    public void whenValidatingPassword_andItContainsNoSpecialCharacter_thenReturnFalse() {
        // Arrange
        var passwordInput = "12345";

        // Act
        var hasSpecialCharacter = PasswordValidator.hasSpecialCharacter(passwordInput);

        // Assert
        assertFalse(hasSpecialCharacter);
    }

    @Test
    public void whenValidatingPassword_andItContainsSpecialCharacter_thenReturnTrue() {
        // Arrange
        var passwordInput = "12345%";

        // Act
        var hasSpecialCharacter = PasswordValidator.hasSpecialCharacter(passwordInput);

        // Assert
        assertTrue(hasSpecialCharacter);
    }

    @Test
    public void whenValidatingPassword_andItContainsUpperCase_thenReturnTrue() {
        // Arrange
        var passwordInput = "ABCabc123";

        // Act

        // Assert
        assertTrue(false);
    }
    @Test
    public void whenValidatingPassword_andItContainsNoUpperCase_thenReturnFalse() {
        // Arrange
        var passwordInput = "abcabc123";

        // Act

        // Assert
        assertTrue(false);
    }
}

package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PasswordValidator {

    public static boolean hasValidLength(String password) {
        return password.length() > 6;
    }

    public static boolean hasSpecialCharacter(String password) {
        var compulsarySpecialCharacters = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

        for (char specialCharacter : compulsarySpecialCharacters.toCharArray()) {
            if (password.contains(String.valueOf(specialCharacter))) {
                return true;
            }
        }

        return false;
    }
}

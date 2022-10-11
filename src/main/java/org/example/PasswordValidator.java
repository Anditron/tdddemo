package org.example;

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

    public static boolean hasUpperCaseCharacter(String password) {
        return !password.toLowerCase().equals(password);
    }
}

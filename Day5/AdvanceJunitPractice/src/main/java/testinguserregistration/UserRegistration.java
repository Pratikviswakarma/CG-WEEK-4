package testinguserregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // Regular expression for a valid email format
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static void registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !Pattern.matches(EMAIL_REGEX, email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters, contain one uppercase letter, and one digit");
        }

        System.out.println("User registered successfully: " + username);
    }

    public static void main(String[] args) {
        try {
            registerUser("john_doe", "john.doe@example.com", "Password1");
            registerUser("jane123", "invalid-email", "pass123");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


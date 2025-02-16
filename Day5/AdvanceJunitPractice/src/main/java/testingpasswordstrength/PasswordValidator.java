package testingpasswordstrength;

public class PasswordValidator {
    //method for valid password
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUppercase && hasDigit;
    }
    //Main method
    public static void main(String[] args) {
        String[] testPasswords = {"Pass1234", "weakpass", "PASSWORD", "pass1234", "Short1", "ValidPass1"};

        for (String password : testPasswords) {
            System.out.println("Password: " + password + " -> " +
                    (isValidPassword(password) ? "Valid" : "Invalid"));
        }
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import testinguserregistration.UserRegistration;

class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("john_doe", "john.doe@example.com", "Password1"),
                "Valid user registration should not throw an exception");
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "test@example.com", "Password1"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testNullUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser(null, "test@example.com", "Password1"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("user1", "invalid-email", "Password1"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testNullEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("user1", null, "Password1"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testWeakPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("user1", "test@example.com", "weakpass"));
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("user1", "test@example.com", "Pwd1"));
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit", exception.getMessage());
    }

    @Test
    void testPasswordWithoutUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("user1", "test@example.com", "password1"));
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit", exception.getMessage());
    }

    @Test
    void testPasswordWithoutDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("user1", "test@example.com", "Password"));
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit", exception.getMessage());
    }
}


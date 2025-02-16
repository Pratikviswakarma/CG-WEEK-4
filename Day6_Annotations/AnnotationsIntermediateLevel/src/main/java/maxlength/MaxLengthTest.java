package maxlength;

public class MaxLengthTest {
    public static void main(String[] args) {
        try {
            User validUser = new User("JohnDoe");
            System.out.println("Valid Username: " + validUser.getUsername());

            User invalidUser = new User("LongUsername123");
            System.out.println("Invalid Username: " + invalidUser.getUsername());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}



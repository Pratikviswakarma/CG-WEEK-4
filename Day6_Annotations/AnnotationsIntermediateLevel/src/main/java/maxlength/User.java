package maxlength;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        validateLength(username);
        this.username = username;
    }

    private void validateLength(String input) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (input.length() > maxLength) {
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength + " characters.");
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}


package accessandmodifystatic;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;

            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);

            System.out.println("Original API_KEY: " + Configuration.getApiKey());
            apiKeyField.set(null, "NEW-API-67890");
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


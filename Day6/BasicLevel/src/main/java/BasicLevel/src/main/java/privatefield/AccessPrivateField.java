package privatefield;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            System.out.println("Original Age: " + ageField.get(person));
            ageField.set(person, 30);
            System.out.println("Modified Age: " + ageField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

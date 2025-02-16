package dynamicobjects;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("Student");

            Object student1 = studentClass.getDeclaredConstructor().newInstance();
            studentClass.getMethod("display").invoke(student1);

            Constructor<?> constructor = studentClass.getConstructor(String.class);
            Object student2 = constructor.newInstance("John Doe");
            studentClass.getMethod("display").invoke(student2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


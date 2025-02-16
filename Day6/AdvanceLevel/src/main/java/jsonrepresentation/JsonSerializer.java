package jsonrepresentation;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        try {
            Class<?> clazz = obj.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                json.append("\"").append(fields[i].getName()).append("\": \"").append(fields[i].get(obj)).append("\"");

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Error serializing object", e);
        }

        json.append("}");
        return json.toString();
    }
}


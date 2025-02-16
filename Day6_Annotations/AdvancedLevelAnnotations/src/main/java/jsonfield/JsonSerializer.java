package jsonfield;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    public static String toJson(Object obj) {
        Map<String, String> jsonMap = new HashMap<>();
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                try {
                    jsonMap.put(annotation.name(), field.get(obj).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return jsonMap.toString().replace("=", ": ");
    }

    public static void main(String[] args) {
        User user = new User("Alice", 25, "secret123");
        String json = toJson(user);
        System.out.println(json);
    }
}


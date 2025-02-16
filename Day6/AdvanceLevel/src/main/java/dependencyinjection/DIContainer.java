package dependencyinjection;

import java.lang.reflect.Field;

public class DIContainer {
    public static void injectDependencies(Object obj) {
        try {
            Field[] fields = obj.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();
                    field.set(obj, dependency);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Dependency injection failed", e);
        }
    }
}


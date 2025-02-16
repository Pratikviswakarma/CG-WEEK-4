package markimportantmethods;

import java.lang.reflect.Method;

public class AnnotationScanner {
    public static void main(String[] args) {
        Class<?> clazz = CriticalOperations.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
                System.out.println("--------------------------");
            }
        }

        // Optionally, invoke all important methods
        try {
            CriticalOperations operations = new CriticalOperations();
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    method.invoke(operations);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

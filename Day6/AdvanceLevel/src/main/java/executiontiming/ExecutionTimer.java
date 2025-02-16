package executiontiming;

import java.lang.reflect.Method;

public class ExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName, Object... args) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            long start = System.nanoTime();
            method.invoke(obj, args);
            long end = System.nanoTime();

            System.out.println("Execution time of " + methodName + ": " + (end - start) + " nanoseconds");
        } catch (Exception e) {
            throw new RuntimeException("Error executing method", e);
        }
    }
}


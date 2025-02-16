package loggingmethod;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {
    public static void main(String[] args) {
        PerformanceTests tests = new PerformanceTests();
        Class<?> clazz = PerformanceTests.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long startTime = System.nanoTime();
                    method.invoke(tests);
                    long endTime = System.nanoTime();
                    long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                    System.out.println("Execution Time of " + method.getName() + ": " + executionTime + " ms");
                    System.out.println("----------------------");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

